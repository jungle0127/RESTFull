package com.ps.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class LogControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetNames() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/ps/name/{firstName}/{familyName}")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testGetCorporation() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/ps/company")).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
