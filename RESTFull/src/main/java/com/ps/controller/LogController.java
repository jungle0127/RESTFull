package com.ps.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class LogController {
	@RequestMapping("/get-names")
	@ApiOperation(value="Get a list of names.", notes="it's only for demo.")
	public List<String> getNames(){
		LinkedList<String> nameList = new LinkedList<>();
		nameList.add("jinghe");
		nameList.add("lotus");
		return nameList;
	}
}
