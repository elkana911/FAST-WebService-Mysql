package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import com.ppu.fast.ws.domain.MstCities;
import com.ppu.fast.ws.domain.MstKecamatan;
import com.ppu.fast.ws.domain.MstKelurahan;
import com.ppu.fast.ws.domain.MstProvinsi;
import com.ppu.fast.ws.domain.MstZip;

public class AreaList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MstKelurahan> kelurahan;
	private List<MstKecamatan> kecamatan;
	private List<MstCities> city;
	private List<MstProvinsi> provinsi;
	private List<MstZip> zip;
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
	public List<MstZip> getZip() {
		return zip;
	}
	public void setZip(List<MstZip> zip) {
		this.zip = zip;
	}

}
