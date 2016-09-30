package com.eric.ws.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ppu.fast.ws.domain.TrnChangeAddr;
import com.ppu.fast.ws.domain.TrnChangeAddrPK;
import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.service.IFastService;
import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestArea;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.request.RequestKelurahan;
import com.ppu.fast.ws.service.request.RequestLKPByDate;
import com.ppu.fast.ws.service.request.RequestRVB;
import com.ppu.fast.ws.service.request.RequestSyncChangeAddr;
import com.ppu.fast.ws.service.request.RequestSyncLKP;
import com.ppu.fast.ws.service.request.RequestZipCode;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseArea;
import com.ppu.fast.ws.service.response.ResponseAreaList;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetMasterArea;
import com.ppu.fast.ws.service.response.ResponseGetMasterData;
import com.ppu.fast.ws.service.response.ResponseGetUsers;
import com.ppu.fast.ws.service.response.ResponseKelurahan;
import com.ppu.fast.ws.service.response.ResponseRVB;
import com.ppu.fast.ws.service.response.ResponseServerInfo;
import com.ppu.fast.ws.service.response.ResponseSync;
import com.ppu.fast.ws.service.response.ResponseZipCode;

public class FastServiceTest extends BaseManagerTestCase{

	@Autowired IFastService fast;
	
	@Ignore
	@Test
	public void testGetServerInfo() throws Exception{
		ResponseServerInfo resp = fast.getServerInfo();
		
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetLKP() throws Exception{
		RequestGetLKP req = new RequestGetLKP();	
		
		req.setCollectorCode("21131325");
		
		ResponseGetLKP resp = fast.getLKP(req);
		
		System.out.println(resp.getData().getTotalCount());
	}

	@Ignore
	@Test
	public void testGetLKPByDate() throws Exception{
		RequestLKPByDate req = new RequestLKPByDate();
		
		req.setCollectorCode("21131325");
		req.setYyyyMMdd("20160920");
		
		ResponseGetLKP resp = fast.getLKPByDate(req);
		
		System.out.println(resp.getData().getTotalCount());
	}
	

	@Ignore
	@Test
	public void testGetMasterData() throws Exception{
		ResponseGetMasterData resp = fast.getMasterData();
		
		System.out.println(resp.getData().getTotalCount());
	}

	@Ignore
	@Test
	public void testGetAllArea() throws Exception{
		ResponseGetMasterArea resp = fast.getMasterArea();
		
		System.out.println(resp.getData().getTotalCount());
	}
	
	@Ignore
	@Test
	public void testGetUsers() throws Exception{

		ResponseGetUsers resp = fast.getUsers();
		
		System.out.println(resp.getData());
		
	}

	@Ignore
	@Test
	public void testLogin() throws Exception{
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setId("21150164");
		loginRequest.setPassword("23011987");
		LoginResponse resp = fast.login(loginRequest);
		
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testZip() throws Exception{
		RequestZipCode req = new RequestZipCode();
		
		ResponseZipCode resp = fast.getZip(req);
		
//		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetKelurahan() throws Exception{
		RequestKelurahan req = new RequestKelurahan();
		req.setName("cengkareng");
		req.setZipCode("20552");
		
		ResponseKelurahan resp = fast.getKelurahan(req);
		
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetAreaByKelurahan() throws Exception{
		RequestArea req = new RequestArea();
		req.setKelurahan("Cengkareng Timur");
		
		ResponseArea resp = fast.getArea(req);
		
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetAreaListByKelurahan() throws Exception{
		RequestArea req = new RequestArea();
		req.setKelurahan("grogol");
		
		ResponseAreaList resp = fast.getAreaList(req);
		
		for (int i = 0; i < resp.getData().getKelurahan().size(); i++) {
			System.out.println(resp.getData().getKelurahan().get(i).getKelurahan());
		}
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetAreaByZipCode() throws Exception{
		RequestArea req = new RequestArea();
		req.setZipCode("20552");
		
		ResponseArea resp = fast.getArea(req);
		
		System.out.println(resp.getData());
	}
	
	@Ignore
	@Test
	public void testGetRVB() throws Exception{
		RequestRVB req = new RequestRVB();
		req.setCollectorId("123");
		
		ResponseRVB resp = fast.getRVB(req);
		
		System.out.println();
	}
	
	@Ignore
	@Test
	public void tesSyncChangeAddr() throws Exception{
		
		RequestSyncChangeAddr req = new RequestSyncChangeAddr();
		
		List<TrnChangeAddr> addrList = new ArrayList<TrnChangeAddr>();
		
		TrnChangeAddr e1 = new TrnChangeAddr();
		TrnChangeAddrPK pk1 = new TrnChangeAddrPK();
		// selalu mulai dari 2, based on contract. jika contractnya sama maka seqNo+1
		pk1.setContractNo("ABC123");
		pk1.setSeqNo(2L);
		e1.setPk(pk1);
		
		e1.setCollAddr("Alamat 1");
		addrList.add(e1);
		///////////////////////
		TrnChangeAddr e2 = new TrnChangeAddr();
		TrnChangeAddrPK pk2 = new TrnChangeAddrPK();
		// selalu mulai dari 2, based on contract. jika contractnya sama maka seqNo+1
		pk2.setContractNo("ABC123");
		pk2.setSeqNo(3L);
		e2.setPk(pk2);
		
		e2.setCollAddr("Alamat 2");
		addrList.add(e2);
		////////////////////////
		TrnChangeAddr e3 = new TrnChangeAddr();
		TrnChangeAddrPK pk3 = new TrnChangeAddrPK();
		// selalu mulai dari 2, based on contract. jika contractnya sama maka seqNo+1
		pk3.setContractNo("DEF123");
		pk3.setSeqNo(2L);
		e3.setPk(pk3);
		
		e3.setCollAddr("Alamat 3");
		addrList.add(e3);
		

		req.setData(addrList);
		
		ResponseSync resp = fast.syncChangeAddress(req);

		System.out.println(resp.getData());
		assertTrue(addrList.size() == resp.getData());
	}

	@Test
	public void tesSyncRVB() throws Exception{
		RequestSyncLKP req = new RequestSyncLKP();
		
		List<TrnRVB> rvb = new ArrayList<TrnRVB>();

		TrnRVB e1 = new TrnRVB();
		e1.setRvbNo("7100016K1183041");
		e1.setOfficeCode("71000");
		e1.setRvbOnHand("26160164");
		e1.setRvbStatus("OP");
		e1.setFlagDone("Y");
		
		rvb.add(e1);
		
		req.setRvb(rvb);
		
		ResponseSync resp = fast.syncRVB(req);
			
		System.out.println(resp.getData());	
	}
	
}
