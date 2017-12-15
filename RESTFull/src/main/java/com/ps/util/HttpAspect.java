package com.ps.util;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class HttpAspect {
	private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	
	@Pointcut(value="execution(public * com.ps.controller.LogController.*(..))")
	public void log() {
		
	}
	
	@Before(value="log()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes requestAttributes =  (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		
		logger.info("URL:{}",request.getRequestURL());
		logger.info("Method:{}", request.getMethod());
		logger.info("IP:{}", request.getRemoteHost());
		logger.info("class method: {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
		logger.info("args:{}", joinPoint.getArgs());
	}
	
	@After(value="log()")
	public void doAfter() {
		logger.info("AFTER");
		System.out.println("TEST");
	}
}
