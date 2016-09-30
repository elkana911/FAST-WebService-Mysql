package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import com.ppu.fast.ws.domain.HistInstallments;
import com.ppu.fast.ws.domain.TrnBastbj;
import com.ppu.fast.ws.domain.TrnCollectAddr;
import com.ppu.fast.ws.domain.TrnContractBuckets;
import com.ppu.fast.ws.domain.TrnLDVComments;
import com.ppu.fast.ws.domain.TrnLDVDetails;
import com.ppu.fast.ws.domain.TrnLDVHeader;
import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.domain.TrnRVColl;
import com.ppu.fast.ws.domain.TrnRepo;
import com.ppu.fast.ws.domain.TrnVehicleInfo;

public class LKPData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TrnLDVHeader header;
	private List<TrnLDVDetails> details;
	private List<TrnCollectAddr> address;
	private List<TrnContractBuckets> buckets;
	private List<TrnRVB> rvb;
	private List<TrnBastbj> bastbj;
	private List<TrnVehicleInfo> vehicleInfo;
	private List<HistInstallments> historyInstallments;

	private List<TrnRVColl> rvColl;
	private List<TrnRepo> repo;
	private List<TrnLDVComments> ldvComments;
	
	public LKPData() {
	}

	public TrnLDVHeader getHeader() {
		return header;
	}

	public void setHeader(TrnLDVHeader header) {
		this.header = header;
	}

	public List<TrnLDVDetails> getDetails() {
		return details;
	}

	public void setDetails(List<TrnLDVDetails> details) {
		this.details = details;
	}

	public List<TrnCollectAddr> getAddress() {
		return address;
	}

	public void setAddress(List<TrnCollectAddr> address) {
		this.address = address;
	}

	public List<TrnContractBuckets> getBuckets() {
		return buckets;
	}

	public void setBuckets(List<TrnContractBuckets> buckets) {
		this.buckets = buckets;
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
	
	public List<TrnVehicleInfo> getVehicleInfo() {
		return vehicleInfo;
	}

	public void setVehicleInfo(List<TrnVehicleInfo> vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public List<HistInstallments> getHistoryInstallments() {
		return historyInstallments;
	}

	public void setHistoryInstallments(List<HistInstallments> historyInstallments) {
		this.historyInstallments = historyInstallments;
	}

	
	public List<TrnRVColl> getRvColl() {
		return rvColl;
	}

	public void setRvColl(List<TrnRVColl> rvColl) {
		this.rvColl = rvColl;
	}

	public List<TrnRepo> getRepo() {
		return repo;
	}

	public void setRepo(List<TrnRepo> repo) {
		this.repo = repo;
	}

	public List<TrnLDVComments> getLdvComments() {
		return ldvComments;
	}

	public void setLdvComments(List<TrnLDVComments> ldvComments) {
		this.ldvComments = ldvComments;
	}

	@Transient
	public int getTotalCount() {
		int sum = header == null ? 0 : 1;
		
		if (details != null)
			sum += details.size();
		
		if (address != null)
			sum += address.size();
		
		if (buckets != null)
			sum += buckets.size();

		if (rvb != null)
			sum += rvb.size();
		
		if (bastbj != null)
			sum += bastbj.size();
		
		if (vehicleInfo != null)
			sum += vehicleInfo.size();
		
		if (historyInstallments != null)
			sum += historyInstallments.size();
		
		if (rvColl != null)
			sum += rvColl.size();
		
		if (repo != null)
			sum += repo.size();
		
		if (ldvComments != null)
			sum += ldvComments.size();
		
		return sum;
			
	}

}
