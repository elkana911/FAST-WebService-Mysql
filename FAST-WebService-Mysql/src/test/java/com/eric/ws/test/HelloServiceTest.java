package com.eric.ws.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ppu.fast.ws.service.IHelloService;
import com.ppu.fast.ws.service.response.HelloWebResponse;

public class HelloServiceTest extends BaseManagerTestCase{
	
	@Autowired IHelloService hello;
	
	@Test
	public void tesHello() throws Exception{
		HelloWebResponse resp = hello.hello("Elkana");
		
		System.out.println(resp.getData());
	}
}
