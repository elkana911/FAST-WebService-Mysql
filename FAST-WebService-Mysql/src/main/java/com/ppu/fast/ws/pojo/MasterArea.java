package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import com.ppu.fast.ws.domain.MstCities;
import com.ppu.fast.ws.domain.MstKecamatan;
import com.ppu.fast.ws.domain.MstKelurahan;
import com.ppu.fast.ws.domain.MstProvinsi;

public class MasterArea implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<MstKelurahan> kelurahan;
	private List<MstKecamatan> kecamatan;
	private List<MstCities> city;
	private List<MstProvinsi> provinsi;

	public List<MstKelurahan> getKelurahan() {
		return kelurahan;
	}
	public void setKelurahan(List<MstKelurahan> kelurahan) {
		this.kelurahan = kelurahan;
	}

	public List<MstKecamatan> getKecamatan() {
		return kecamatan;
	}

	public void setKecamatan(List<MstKecamatan> kecamatan) {
		this.kecamatan = kecamatan;
	}

	public List<MstCities> getCity() {
		return city;
	}

	public void setCity(List<MstCities> city) {
		this.city = city;
	}

	public List<MstProvinsi> getProvinsi() {
		return provinsi;
	}

	public void setProvinsi(List<MstProvinsi> provinsi) {
		this.provinsi = provinsi;
	}

	@Transient
	public int getTotalCount() {
		int sum = 0;

		if (kelurahan != null)
			sum += kelurahan.size();
		
		if (kecamatan != null)
			sum += kecamatan.size();
		
		if (city != null)
			sum += city.size();
		
		if (provinsi != null)
			sum += provinsi.size();

		return sum;
	}

}
