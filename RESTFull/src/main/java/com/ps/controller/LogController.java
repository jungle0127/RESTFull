package com.ps.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/ps")
public class LogController {
	@GetMapping("/name/{firstName}/{familyName}")
	@ApiOperation(value="Get a list of names.", notes="it's only for demo.")
	public List<String> getNames(
			@PathVariable(name="firstName", required=true)
			@ApiParam(value="first name", required=true)
			String firstName, 
			@PathVariable(name="familyName", required=true)
			@ApiParam(value="family name", required=true)
			String familyName){
		LinkedList<String> nameList = new LinkedList<>();
		nameList.add(firstName);
		nameList.add(familyName);
		return nameList;
	}
	@GetMapping("/company")
	public String getCorporation() {
		return "Veritas";
	}
}
