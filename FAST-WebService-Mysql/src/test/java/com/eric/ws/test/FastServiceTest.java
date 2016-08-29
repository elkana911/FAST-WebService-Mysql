package com.eric.ws.test;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ppu.fast.ws.service.IFastService;
import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetUsers;

public class FastServiceTest extends BaseManagerTestCase{

	@Autowired IFastService fast;
	
	@Test
	public void testGetLKP() throws Exception{
		RequestGetLKP req = new RequestGetLKP();	
		
		req.setCollectorCode("21160300");
		
		ResponseGetLKP resp = fast.getLKP(req);
		
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetUsers() throws Exception{

		ResponseGetUsers resp = fast.getUsers();
		
		System.out.println(resp.getData().size());
		
	}

	@Ignore
	@Test
	public void testLogin() throws Exception{
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setId("MUM01");
		loginRequest.setPassword("12345");
		LoginResponse resp = fast.login(loginRequest);
		
		System.out.println(resp.getData());
		
	}
	
	
}
