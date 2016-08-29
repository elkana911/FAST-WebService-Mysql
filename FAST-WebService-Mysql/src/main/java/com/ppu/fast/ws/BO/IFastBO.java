package com.ppu.fast.ws.BO;

import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetUsers;

public interface IFastBO {
	LoginResponse login(LoginRequest loginRequest) throws Exception;

	ResponseGetUsers getUsers() throws Exception;

	ResponseGetLKP getLKP(RequestGetLKP req) throws Exception;
}
