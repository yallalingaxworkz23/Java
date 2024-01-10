package com.xworkz.collectionSorting.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class IceCreemDTO implements Serializable,Comparable<IceCreemDTO>{
	private String name;
	private String falvour;
	private Double  price ;
	private String type;
	public IceCreemDTO() {
		// TODO Auto-generated constructor stub
	}
	public IceCreemDTO(String name, String falvour, Double price, String type, LocalDate mandate) {
		super();
		this.name = name;
		this.falvour = falvour;
		this.price = price;
		this.type = type;
		this.mandate = mandate;
	}
	@Override
	public String toString() {
		return "IceCreemDTO [name=" + name + ", falvour=" + falvour + ", price=" + price + ", type=" + type
				+ ", mandate=" + mandate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((falvour == null) ? 0 : falvour.hashCode());
		result = prime * result + ((mandate == null) ? 0 : mandate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		IceCreemDTO other = (IceCreemDTO) obj;
		if (falvour == null) {
			if (other.falvour != null)
				return false;
		} else if (!falvour.equals(other.falvour))
			return false;
		if (mandate == null) {
			if (other.mandate != null)
				return false;
		} else if (!mandate.equals(other.mandate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFalvour() {
		return falvour;
	}
	public void setFalvour(String falvour) {
		this.falvour = falvour;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getMandate() {
		return mandate;
	}
	public void setMandate(LocalDate mandate) {
		this.mandate = mandate;
	}
	private LocalDate mandate;
	@Override
	public int compareTo(IceCreemDTO arguments) {
		return this.price.compareTo(arguments.price);
		
	}

}
