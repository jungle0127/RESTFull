package com.ps.controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ps.controller.dto.Name;
import com.ps.service.GetNameServiceClient;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class LogControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Before
	public void setUp() throws JsonProcessingException {
		System.out.println("Before each UT");
	}
	
	@Test
	public void testGetNames() throws Exception {
//		String responseString = objectMapper.writeValueAsString(new Name("jinghe","zhang"));
//		this.server.expect(requestTo("/jinghe/zhang"))
//		.andRespond(withSuccess(responseString, MediaType.APPLICATION_JSON));
//		Name name = this.getNameServiceClient.getUserNames("jinghe", "zhang");
		
//		this.mockMvc.perform(MockMvcRequestBuilders.get("/ps/name/{firstName}/{familyName}")).andExpect(MockMvcResultMatchers.status().isOk());
		
	}
	@Test
	public void testGetCorporation() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/ps/company")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
