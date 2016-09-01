package com.ppu.fast.ws.BO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ppu.fast.ws.BO.IFastBO;
import com.ppu.fast.ws.DAO.IFastDao;
import com.ppu.fast.ws.common.ErrorName;
import com.ppu.fast.ws.domain.MstSecUserVO;
import com.ppu.fast.ws.pojo.LKPData;
import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetUsers;
import com.ppu.fast.ws.util.Utils;

@Component("fastBO")
public class FastBOImpl extends BasicBO implements IFastBO {

	@Autowired IFastDao fastDao;
	
	@Override
	public LoginResponse login(LoginRequest loginRequest) throws Exception {
		// validate here
		
		LoginResponse resp = new LoginResponse();
		resp.setIp(Utils.getClientIP());
		
		if (Utils.isEmpty(loginRequest.getId())){
			resp.setError(getErrorResponse(ErrorName.INPUT_MISSING));		
			
			return resp;
		}else{
			MstSecUserVO ret = null;
			
			if (!Utils.isEmpty(loginRequest.getId()))
			 ret = fastDao.login(loginRequest.getId(), loginRequest.getPassword());
			
			if (ret != null){
				resp.setData(ret);
			}else{
				resp.setError(getErrorResponse(ErrorName.UNAUTHORIZED_LOGIN));
			}
		}
		
		return resp;

	}

	@Override
	public ResponseGetUsers getUsers() throws Exception {
		
		ResponseGetUsers resp = new ResponseGetUsers();
		resp.setIp(Utils.getClientIP());

		List<MstSecUserVO> ret = fastDao.getUsers();
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.DATABASE_ERROR));
		}
		
		return resp;
	}

	@Override
	public ResponseGetLKP getLKP(RequestGetLKP req) throws Exception {
		ResponseGetLKP resp = new ResponseGetLKP();
		resp.setIp(Utils.getClientIP());

		LKPData ret = null;
				
		if (Utils.isEmpty(req.getCollectorCode())) {
			resp.setError(getErrorResponse(ErrorName.INPUT_MISSING));		
			
			return resp;
			
		}else {
			ret = fastDao.getLKP(req.getCollectorCode());
		}
		
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.DATABASE_ERROR));
		}
		
		return resp;
	}

}
