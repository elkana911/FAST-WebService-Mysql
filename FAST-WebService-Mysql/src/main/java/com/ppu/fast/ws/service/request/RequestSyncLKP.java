package com.ppu.fast.ws.service.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ppu.fast.ws.domain.TrnBastbj;
import com.ppu.fast.ws.domain.TrnChangeAddr;
import com.ppu.fast.ws.domain.TrnLDVComments;
import com.ppu.fast.ws.domain.TrnLDVDetails;
import com.ppu.fast.ws.domain.TrnLDVHeader;
import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.domain.TrnRVColl;
import com.ppu.fast.ws.domain.TrnRepo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RequestSyncLKP")
public class RequestSyncLKP extends BasicRequest{

    private List<TrnLDVHeader> ldvHeader;
    private List<TrnLDVDetails> ldvDetails;
    private List<TrnLDVComments> ldvComments;

    private List<TrnRVColl> rvColl;
    private List<TrnRVB> rvb;
    private List<TrnBastbj> bastbj;
    private List<TrnRepo> repo;
    private List<TrnChangeAddr> changeAddr;

	public List<TrnLDVHeader> getLdvHeader() {
		return ldvHeader;
	}
	public void setLdvHeader(List<TrnLDVHeader> ldvHeader) {
		this.ldvHeader = ldvHeader;
	}
	public List<TrnLDVDetails> getLdvDetails() {
		return ldvDetails;
	}
	public void setLdvDetails(List<TrnLDVDetails> ldvDetails) {
		this.ldvDetails = ldvDetails;
	}
	public List<TrnLDVComments> getLdvComments() {
		return ldvComments;
	}
	public void setLdvComments(List<TrnLDVComments> ldvComments) {
		this.ldvComments = ldvComments;
	}
	public List<TrnRVColl> getRvColl() {
		return rvColl;
	}
	public void setRvColl(List<TrnRVColl> rvColl) {
		this.rvColl = rvColl;
	}
	public List<TrnRVB> getRvb() {
		return rvb;
	}
	public void setRvb(List<TrnRVB> rvb) {
		this.rvb = rvb;
	}
	public List<TrnBastbj> getBastbj() {
		return bastbj;
	}
	public void setBastbj(List<TrnBastbj> bastbj) {
		this.bastbj = bastbj;
	}
	public List<TrnRepo> getRepo() {
		return repo;
	}
	public void setRepo(List<TrnRepo> repo) {
		this.repo = repo;
	}
	public List<TrnChangeAddr> getChangeAddr() {
		return changeAddr;
	}
	public void setChangeAddr(List<TrnChangeAddr> changeAddr) {
		this.changeAddr = changeAddr;
	}

}
