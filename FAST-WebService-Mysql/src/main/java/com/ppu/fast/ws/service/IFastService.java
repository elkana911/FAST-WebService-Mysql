package com.ppu.fast.ws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestArea;
import com.ppu.fast.ws.service.request.RequestCity;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.request.RequestKecamatan;
import com.ppu.fast.ws.service.request.RequestKelurahan;
import com.ppu.fast.ws.service.request.RequestLKPByDate;
import com.ppu.fast.ws.service.request.RequestProvinsi;
import com.ppu.fast.ws.service.request.RequestRVB;
import com.ppu.fast.ws.service.request.RequestSyncChangeAddr;
import com.ppu.fast.ws.service.request.RequestSyncLKP;
import com.ppu.fast.ws.service.request.RequestZipCode;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseArea;
import com.ppu.fast.ws.service.response.ResponseAreaList;
import com.ppu.fast.ws.service.response.ResponseCity;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetMasterArea;
import com.ppu.fast.ws.service.response.ResponseGetMasterData;
import com.ppu.fast.ws.service.response.ResponseGetUsers;
import com.ppu.fast.ws.service.response.ResponseKecamatan;
import com.ppu.fast.ws.service.response.ResponseKelurahan;
import com.ppu.fast.ws.service.response.ResponseProvinsi;
import com.ppu.fast.ws.service.response.ResponseRVB;
import com.ppu.fast.ws.service.response.ResponseServerInfo;
import com.ppu.fast.ws.service.response.ResponseSync;
import com.ppu.fast.ws.service.response.ResponseZipCode;

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

	@POST
	@Path("/lkp_date")
	public ResponseGetLKP getLKPByDate(RequestLKPByDate req);
	/**
	 * 
	 * http://203.128.70.66:6060/fast-ws/fast/lkp.json
	 * 
	 * http://www.albionresearch.com/misc/urlencode.php
	 * @return
	 */
	@POST
	@Path("/masterdata")
	public ResponseGetMasterData getMasterData();

	@POST
	@Path("/masterarea")
	public ResponseGetMasterArea getMasterArea();
	
	@POST
	@Path("/sync_change_addr")
	public ResponseSync syncChangeAddress(RequestSyncChangeAddr req);

	@POST
	@Path("/sync_lkp")
	public ResponseSync syncLKPDetails(RequestSyncLKP req);

	@POST
	@Path("/sync_rvb")
	public ResponseSync syncRVB(RequestSyncLKP req);
	
	@POST
	@Path("/zip_code")
	public ResponseZipCode getZip(RequestZipCode req);

	@POST
	@Path("/kelurahan")
	public ResponseKelurahan getKelurahan(RequestKelurahan req);
	
	@POST
	@Path("/kecamatan")
	public ResponseKecamatan getKecamatan(RequestKecamatan req);
	
	@POST
	@Path("/cities")
	public ResponseCity getCities(RequestCity req);
	
	@POST
	@Path("/provinsi")
	public ResponseProvinsi getProvinsi(RequestProvinsi req);

	@POST
	@Path("/area")
	public ResponseArea getArea(RequestArea req);

	@POST
	@Path("/area_list")
	public ResponseAreaList getAreaList(RequestArea req);

	@POST
	@Path("/server_info")
	public ResponseServerInfo getServerInfo();

	@POST
	@Path("/rvb")
	public ResponseRVB getRVB(RequestRVB req);
	
	@POST
	@Path("/upload_photo")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
//	public Void uploadFile(@Multipart(value="spcfic contentId", type="application/octet-stream") Attachment attachment);
	public Response uploadFile(@Multipart("owner") String name, List<Attachment> attachments);
	
}
