package com.xworkz.app.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable{
	private int id;
	private String hname;
	private String ownername;
	private double gst;
	private String location;
	public HotelDTO() {
		
	}
	public HotelDTO(int id, String hname, String ownername, double gst, String location) {
		super();
		this.id = id;
		this.hname = hname;
		this.ownername = ownername;
		this.gst = gst;
		this.location = location;
	}
	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", hname=" + hname + ", ownername=" + ownername + ", gst=" + gst + ", location="
				+ location + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(gst);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((hname == null) ? 0 : hname.hashCode());
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((ownername == null) ? 0 : ownername.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDTO other = (HotelDTO) obj;
		if (Double.doubleToLongBits(gst) != Double.doubleToLongBits(other.gst))
			return false;
		if (hname == null) {
			if (other.hname != null)
				return false;
		} else if (!hname.equals(other.hname))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (ownername == null) {
			if (other.ownername != null)
				return false;
		} else if (!ownername.equals(other.ownername))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
}
