package com.ppu.fast.ws.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ppu.fast.ws.service.IHelloService;
import com.ppu.fast.ws.service.response.HelloWebResponse;
import com.ppu.fast.ws.util.Utils;

@Service("helloService")
@Transactional
public class HelloServiceImpl implements IHelloService {
    private static Logger log = LoggerFactory.getLogger(HelloServiceImpl.class);

	@Override
	public HelloWebResponse hello(String name) {
		HelloWebResponse helloWebResponse = new HelloWebResponse();
		
		helloWebResponse.setData("Hello " + name);
		helloWebResponse.setError(null);
		helloWebResponse.setIp(Utils.getClientIP());
		
		return helloWebResponse;
	}

	@Override
	public HelloWebResponse hello() {
		HelloWebResponse helloWebResponse = new HelloWebResponse();
		
		helloWebResponse.setData("Hello World");
		helloWebResponse.setError(null);
		helloWebResponse.setIp(Utils.getClientIP());
		
		return helloWebResponse;
	}

}
