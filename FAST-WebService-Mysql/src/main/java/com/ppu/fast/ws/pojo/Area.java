package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import com.ppu.fast.ws.domain.MstCities;
import com.ppu.fast.ws.domain.MstKecamatan;
import com.ppu.fast.ws.domain.MstKelurahan;
import com.ppu.fast.ws.domain.MstProvinsi;
import com.ppu.fast.ws.domain.MstZip;

public class Area implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MstKelurahan kelurahan;
	private MstKecamatan kecamatan;
	private MstCities city;
	private MstProvinsi provinsi;
	private List<MstZip> zip;
	
	public MstKelurahan getKelurahan() {
		return kelurahan;
	}
	public void setKelurahan(MstKelurahan kelurahan) {
		this.kelurahan = kelurahan;
	}
	public MstKecamatan getKecamatan() {
		return kecamatan;
	}
	public void setKecamatan(MstKecamatan kecamatan) {
		this.kecamatan = kecamatan;
	}
	public MstCities getCity() {
		return city;
	}
	public void setCity(MstCities city) {
		this.city = city;
	}
	public MstProvinsi getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(MstProvinsi provinsi) {
		this.provinsi = provinsi;
	}
	public List<MstZip> getZip() {
		return zip;
	}
	public void setZip(List<MstZip> zip) {
		this.zip = zip;
	}

}
