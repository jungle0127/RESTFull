package com.ps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.controller.dto.Name;
import com.ps.controller.dto.RestResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/ps")
public class LogController {
	@GetMapping("/name/{firstName}/{familyName}")
	@ApiOperation(value="Get a list of names.", notes="it's only for demo.")
	public Name getNames(
			@PathVariable(name="firstName", required=true)
			@ApiParam(value="first name", required=true)
			String firstName, 
			@PathVariable(name="familyName", required=true)
			@ApiParam(value="family name", required=true)
			String familyName){
		RestResponse<Name> response = new RestResponse<>();
		Name name = new Name();
		name.setFamilyName(familyName);
		name.setFirstName(firstName);
		response.setCode(1);
		response.setData(name);
		response.setMessage("success");
		return name;
	}
	@GetMapping("/company")
	public String getCorporation() {
		return "Veritas";
	}
}
