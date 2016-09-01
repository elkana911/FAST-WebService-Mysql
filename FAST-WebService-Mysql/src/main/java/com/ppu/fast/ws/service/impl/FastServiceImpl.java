package com.ppu.fast.ws.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ppu.fast.ws.BO.IFastBO;
import com.ppu.fast.ws.service.IFastService;
import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetUsers;

@Service("fastService")
@Transactional
public class FastServiceImpl implements IFastService {

	@Autowired IFastBO fastBO;
	
	@Transactional
	@Override
	public LoginResponse login(LoginRequest loginRequest) {
		LoginResponse resp = null;
		try {
			resp = fastBO.login(loginRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}

	@Transactional
	@Override
	public ResponseGetUsers getUsers() {
		ResponseGetUsers resp = null;
		try {
			resp = fastBO.getUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}

	@Transactional
	@Override
	public ResponseGetLKP getLKP(RequestGetLKP req) {
		ResponseGetLKP resp = null;
		try {
			resp = fastBO.getLKP(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}

}
