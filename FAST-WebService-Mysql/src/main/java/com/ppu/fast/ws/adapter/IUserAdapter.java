package com.ppu.fast.ws.adapter;

import com.ppu.fast.ws.service.response.LoginInfo;
import com.ppu.fast.ws.service.response.LoginWebResponse;
import com.ppu.fast.ws.service.response.TokenWebResponse;

public interface IUserAdapter {

	LoginWebResponse convertToLoginWebResponse(LoginInfo data);
	TokenWebResponse convertToTokenWebResponse(String data);

}
