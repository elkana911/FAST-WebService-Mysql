package com.ppu.fast.ws.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.activation.DataHandler;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ppu.fast.ws.BO.IFastBO;
import com.ppu.fast.ws.pojo.ServerInfo;
import com.ppu.fast.ws.service.IFastService;
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
import com.ppu.fast.ws.util.Utils;

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

	@Transactional
	@Override
	public ResponseGetLKP getLKPByDate(RequestLKPByDate req) {
		ResponseGetLKP resp = null;
		try {
			resp = fastBO.getLKPByDate(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resp;
	}

	@Transactional
	@Override
	public ResponseGetMasterData getMasterData() {
		ResponseGetMasterData resp = null;
		
		try {
			resp = fastBO.getMasterData();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}
	
	@Transactional
	@Override
	public ResponseGetMasterArea getMasterArea() {
		ResponseGetMasterArea resp = null;
		
		try {
			resp = fastBO.getMasterArea();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}


	@Transactional
	@Override
	public ResponseSync syncChangeAddress(RequestSyncChangeAddr req) {
		ResponseSync resp = null;
		
		try {
			resp = fastBO.syncChangeAddress(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}


	@Transactional
	@Override
	public ResponseSync syncLKPDetails(RequestSyncLKP req) {
		ResponseSync resp = new ResponseSync();
		try {
			resp = fastBO.syncLKP(req);
		}catch (Exception e) {
			e.printStackTrace();
		}

		return resp;
	}

	
	@Transactional
	@Override
	public ResponseZipCode getZip(RequestZipCode req) {
		ResponseZipCode resp = null;
		
		try {
			resp = fastBO.getZip(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseKelurahan getKelurahan(RequestKelurahan req) {
		ResponseKelurahan resp = null;
		
		try {
			resp = fastBO.getKelurahan(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseKecamatan getKecamatan(RequestKecamatan req) {
		ResponseKecamatan resp = null;
		
		try {
			resp = fastBO.getKecamatan(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseCity getCities(RequestCity req) {
		ResponseCity resp = null;
		
		try {
			resp = fastBO.getCity(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseProvinsi getProvinsi(RequestProvinsi req) {
		ResponseProvinsi resp = null;
		
		try {
			resp = fastBO.getProvinsi(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseArea getArea(RequestArea req) {
		ResponseArea resp = null;
		
		try {
			resp = fastBO.getArea(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseAreaList getAreaList(RequestArea req) {
		ResponseAreaList resp = null;
		
		try {
			resp = fastBO.getAreaList(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public ResponseServerInfo getServerInfo() {
		ResponseServerInfo resp = new ResponseServerInfo();
		resp.setIp(Utils.getClientIP());
		
		ServerInfo data = new ServerInfo();
		data.setServerDate(new Date());
		resp.setData(data);

		return resp;
	}

	@Transactional
	@Override
	public ResponseRVB getRVB(RequestRVB req) {
		ResponseRVB resp = null;
		
		try {
			resp = fastBO.getRVB(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Transactional
	@Override
	public ResponseSync syncRVB(RequestSyncLKP req) {
		ResponseSync resp = new ResponseSync();
		try {
			resp = fastBO.syncRVB(req);
		}catch (Exception e) {
			e.printStackTrace();
		}

		return resp;
	}

	@Override
	public Response uploadFile(@Multipart("owner") String name, List<Attachment> attachments) {
	      for (Attachment attachment : attachments) {
	          DataHandler handler = attachment.getDataHandler();
	          try {
	             InputStream stream = handler.getInputStream();
	             MultivaluedMap<String, String> map = attachment.getHeaders();
	             System.out.println("fileName Here" + getFileName(map));
	             OutputStream out = new FileOutputStream(new File("C:/logs/" + getFileName(map)));

	             int read = 0;
	             byte[] bytes = new byte[1024];
	             while ((read = stream.read(bytes)) != -1) {
	                out.write(bytes, 0, read);
	             }
	             stream.close();
	             out.flush();
	             out.close();
	          } catch (Exception e) {
	             e.printStackTrace();
	          }
	       }

	   return Response.ok("file uploaded").build();
	}
	private String getFileName(MultivaluedMap<String, String> header) {
		 
        String[] contentDisposition = header.getFirst("Content-Disposition").split(";");
 
        for (String filename : contentDisposition) {
            if ((filename.trim().startsWith("filename"))) {
 
                String[] name = filename.split("=");
 
                String finalFileName = name[1].trim().replaceAll("\"", "");
                return finalFileName;
            }
        }
        return "unknown";
    }
}
