package com.ppu.fast.ws.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetUsers;

@Path("/fast")
@Produces({ "application/xml", "application/json" })
public interface IFastService {
	
	/**
	 * 
	 * http://203.128.70.66:6060/fast-ws/fast/login.json
	 * {"id":"yuan22100037@nomail.com", "pwd":"22100037"}
	 * JSONObject cred = new JSONObject();
        cred.put("email", "eric.pramudya@gmail.com");
        cred.put("pwd", "test");
        
	 * http://www.albionresearch.com/misc/urlencode.php
	 * @return
	 */
	@POST
	@Path("/login")
	public LoginResponse login(LoginRequest loginRequest);

	/**
	 * 
	 * http://203.128.70.66:6060/fast-ws/fast/users.json
	 * 
	 * http://www.albionresearch.com/misc/urlencode.php
	 * @return
	 */
	@POST
	@Path("/users")
	public ResponseGetUsers getUsers();

	/**
	 * 
	 * http://203.128.70.66:6060/fast-ws/fast/lkp.json
	 * 
	 * http://www.albionresearch.com/misc/urlencode.php
	 * @return
	 */
	@POST
	@Path("/lkp")
	public ResponseGetLKP getLKP(RequestGetLKP req);

}
