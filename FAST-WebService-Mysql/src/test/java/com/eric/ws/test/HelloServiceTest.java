package com.eric.ws.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.domain.TrnRepo;
import com.ppu.fast.ws.service.IHelloService;
import com.ppu.fast.ws.service.response.HelloWebResponse;

public class HelloServiceTest extends BaseManagerTestCase{
	
	@Autowired IHelloService hello;
	
	@Ignore
	@Test
	public void tesHello() throws Exception{
		HelloWebResponse resp = hello.hello("Elkana");
		
		System.out.println(resp.getData());
	}
	
	@Test
	public void tesList() throws Exception{
		List<TrnRVB> a = new ArrayList<TrnRVB>();
		TrnRVB a1 = new TrnRVB();
		a1.setRvbNo("ABC123");
		a.add(a1);
		
		List list = a;
		
		List<TrnRepo> b = new ArrayList<TrnRepo>();
		TrnRepo b1 = new TrnRepo();
		b1.setRepoNo("DEF123");
		b.add(b1);
		
		TrnRepo b2 = new TrnRepo();
		b2.setRepoNo("DGH123");
		b.add(b2);
		
		list = b;

		
	}
}
