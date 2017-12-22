## http://7player.cn/2015/08/30/%E3%80%90%E5%8E%9F%E5%88%9B%E3%80%91%E5%9F%BA%E4%BA%8Espringboot-mybatis%E5%AE%9E%E7%8E%B0springmvc-web%E9%A1%B9%E7%9B%AE/

- Swagger2 document: http://blog.didispace.com/springbootswagger2/
- For swagger: http://localhost/gal/swagger-ui.html
- Swagger and Jersey integration: https://stackoverflow.com/questions/37640863/springfox-swagger-no-api-docs-with-spring-boot-jersey-and-gardle/38004323#38004323
## Microservice
https://www.zhihu.com/question/37808426/answer/93335393

## REST命名规范
http://blog.csdn.net/zghwaicsdn/article/details/53788535

The high level pattern is:
http(s)://server.com/app-name/{version}/{domain}/{rest-convention}

Restful API defination standard article:
https://dzone.com/articles/restful-standard-resolved

## REST UT
http://www.baeldung.com/restclienttest-in-spring-boot

## Spring official document
https://docs.spring.io/spring/docs/5.0.2.RELEASE/spring-framework-reference/
## Spring API online document
https://docs.spring.io/spring/docs/current/javadoc-api/

## maven surefire plugin 使用
1. mvn clean compile findbugs:findbugs    清理原有的字节码文件，并生成findbugs XML报告
   mvn findbugs:gui  打开findbugs GUI工具查看扫描结果
2. mvn clean compile surefire-report:report 生成findbugs HTML报告

## maven Jacoco
mvn clean package

## Java代码质量检测

http://blog.csdn.net/zzq900503/article/details/49616959

findbugs, PMD, CheckStyle