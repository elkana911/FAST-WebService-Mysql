package com.ppu.fast.ws.BO.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ppu.fast.ws.BO.IUserBO;
import com.ppu.fast.ws.adapter.IUserAdapter;
import com.ppu.fast.ws.service.response.LoginWebResponse;
import com.ppu.fast.ws.service.response.TokenWebResponse;

@Component("userBO")
public class UserBOImpl implements IUserBO {

	@Autowired
	private IUserAdapter userAdapter;
	
	@Override
	public LoginWebResponse getLoginInfo(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TokenWebResponse checkToken(String token, String ip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TokenWebResponse generateToken(String ip) {
		// TODO Auto-generated method stub
		return null;
	}

}
