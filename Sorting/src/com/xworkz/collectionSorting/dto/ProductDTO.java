package com.xworkz.collectionSorting.dto;

import java.io.Serializable;
import java.time.LocalDate;


public class ProductDTO implements Serializable,Comparable<ProductDTO>{
	private int id;
	private String name;
	private Double price;
	private String company;
	private LocalDate manfDate;
	private LocalDate expireDate;
	private Double discount;
	private String descrpition;
	private Double quantity;
	private int rateing;
	private String peopleRated;
	private String peopleRated5;
	private String peopleRated4;
	private String peopleRated3;
	private String peopleRated2;
	private String peopleRated1;
	private String packer;
	private Double itemWeight;
	private String included;
	private String genericName;
	private LocalDate avaliabledate;
	private String asin;
	private String damage;
	private String countryofOrigin;
	private Long mobileno;
	private Double serialno;
	private String retunable;
	private String warrenty;
	private String primeDelivaery;
	private LocalDate deliveryExpectedate;
	private LocalDate returnBy;
	
	public ProductDTO() {
	
	}

	public ProductDTO(int id, String name, Double price, String company, LocalDate manfDate, LocalDate expireDate,
			Double discount, String descrpition, Double quantity, int rateing, String peopleRated, String peopleRated5,
			String peopleRated4, String peopleRated3, String peopleRated2, String peopleRated1, String packer,
			Double itemWeight, String included, String genericName, LocalDate avaliabledate, String asin, String damage,
			String countryofOrigin, Long mobileno, Double serialno, String retunable, String warrenty,
			String primeDelivaery, LocalDate deliveryExpectedate, LocalDate returnBy) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.company = company;
		this.manfDate = manfDate;
		this.expireDate = expireDate;
		this.discount = discount;
		this.descrpition = descrpition;
		this.quantity = quantity;
		this.rateing = rateing;
		this.peopleRated = peopleRated;
		this.peopleRated5 = peopleRated5;
		this.peopleRated4 = peopleRated4;
		this.peopleRated3 = peopleRated3;
		this.peopleRated2 = peopleRated2;
		this.peopleRated1 = peopleRated1;
		this.packer = packer;
		this.itemWeight = itemWeight;
		this.included = included;
		this.genericName = genericName;
		this.avaliabledate = avaliabledate;
		this.asin = asin;
		this.damage = damage;
		this.countryofOrigin = countryofOrigin;
		this.mobileno = mobileno;
		this.serialno = serialno;
		this.retunable = retunable;
		this.warrenty = warrenty;
		this.primeDelivaery = primeDelivaery;
		this.deliveryExpectedate = deliveryExpectedate;
		this.returnBy = returnBy;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", company=" + company + ", manfDate="
				+ manfDate + ", expireDate=" + expireDate + ", discount=" + discount + ", descrpition=" + descrpition
				+ ", quantity=" + quantity + ", rateing=" + rateing + ", peopleRated=" + peopleRated + ", peopleRated5="
				+ peopleRated5 + ", peopleRated4=" + peopleRated4 + ", peopleRated3=" + peopleRated3 + ", peopleRated2="
				+ peopleRated2 + ", peopleRated1=" + peopleRated1 + ", packer=" + packer + ", itemWeight=" + itemWeight
				+ ", included=" + included + ", genericName=" + genericName + ", avaliabledate=" + avaliabledate
				+ ", asin=" + asin + ", damage=" + damage + ", countryofOrigin=" + countryofOrigin + ", mobileno="
				+ mobileno + ", serialno=" + serialno + ", retunable=" + retunable + ", warrenty=" + warrenty
				+ ", primeDelivaery=" + primeDelivaery + ", deliveryExpectedate=" + deliveryExpectedate + ", returnBy="
				+ returnBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asin == null) ? 0 : asin.hashCode());
		result = prime * result + ((avaliabledate == null) ? 0 : avaliabledate.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((countryofOrigin == null) ? 0 : countryofOrigin.hashCode());
		result = prime * result + ((damage == null) ? 0 : damage.hashCode());
		result = prime * result + ((deliveryExpectedate == null) ? 0 : deliveryExpectedate.hashCode());
		result = prime * result + ((descrpition == null) ? 0 : descrpition.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((expireDate == null) ? 0 : expireDate.hashCode());
		result = prime * result + ((genericName == null) ? 0 : genericName.hashCode());
		result = prime * result + id;
		result = prime * result + ((included == null) ? 0 : included.hashCode());
		result = prime * result + ((itemWeight == null) ? 0 : itemWeight.hashCode());
		result = prime * result + ((manfDate == null) ? 0 : manfDate.hashCode());
		result = prime * result + ((mobileno == null) ? 0 : mobileno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((packer == null) ? 0 : packer.hashCode());
		result = prime * result + ((peopleRated == null) ? 0 : peopleRated.hashCode());
		result = prime * result + ((peopleRated1 == null) ? 0 : peopleRated1.hashCode());
		result = prime * result + ((peopleRated2 == null) ? 0 : peopleRated2.hashCode());
		result = prime * result + ((peopleRated3 == null) ? 0 : peopleRated3.hashCode());
		result = prime * result + ((peopleRated4 == null) ? 0 : peopleRated4.hashCode());
		result = prime * result + ((peopleRated5 == null) ? 0 : peopleRated5.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((primeDelivaery == null) ? 0 : primeDelivaery.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + rateing;
		result = prime * result + ((retunable == null) ? 0 : retunable.hashCode());
		result = prime * result + ((returnBy == null) ? 0 : returnBy.hashCode());
		result = prime * result + ((serialno == null) ? 0 : serialno.hashCode());
		result = prime * result + ((warrenty == null) ? 0 : warrenty.hashCode());
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
		ProductDTO other = (ProductDTO) obj;
		if (asin == null) {
			if (other.asin != null)
				return false;
		} else if (!asin.equals(other.asin))
			return false;
		if (avaliabledate == null) {
			if (other.avaliabledate != null)
				return false;
		} else if (!avaliabledate.equals(other.avaliabledate))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (countryofOrigin == null) {
			if (other.countryofOrigin != null)
				return false;
		} else if (!countryofOrigin.equals(other.countryofOrigin))
			return false;
		if (damage == null) {
			if (other.damage != null)
				return false;
		} else if (!damage.equals(other.damage))
			return false;
		if (deliveryExpectedate == null) {
			if (other.deliveryExpectedate != null)
				return false;
		} else if (!deliveryExpectedate.equals(other.deliveryExpectedate))
			return false;
		if (descrpition == null) {
			if (other.descrpition != null)
				return false;
		} else if (!descrpition.equals(other.descrpition))
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (expireDate == null) {
			if (other.expireDate != null)
				return false;
		} else if (!expireDate.equals(other.expireDate))
			return false;
		if (genericName == null) {
			if (other.genericName != null)
				return false;
		} else if (!genericName.equals(other.genericName))
			return false;
		if (id != other.id)
			return false;
		if (included == null) {
			if (other.included != null)
				return false;
		} else if (!included.equals(other.included))
			return false;
		if (itemWeight == null) {
			if (other.itemWeight != null)
				return false;
		} else if (!itemWeight.equals(other.itemWeight))
			return false;
		if (manfDate == null) {
			if (other.manfDate != null)
				return false;
		} else if (!manfDate.equals(other.manfDate))
			return false;
		if (mobileno == null) {
			if (other.mobileno != null)
				return false;
		} else if (!mobileno.equals(other.mobileno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (packer == null) {
			if (other.packer != null)
				return false;
		} else if (!packer.equals(other.packer))
			return false;
		if (peopleRated == null) {
			if (other.peopleRated != null)
				return false;
		} else if (!peopleRated.equals(other.peopleRated))
			return false;
		if (peopleRated1 == null) {
			if (other.peopleRated1 != null)
				return false;
		} else if (!peopleRated1.equals(other.peopleRated1))
			return false;
		if (peopleRated2 == null) {
			if (other.peopleRated2 != null)
				return false;
		} else if (!peopleRated2.equals(other.peopleRated2))
			return false;
		if (peopleRated3 == null) {
			if (other.peopleRated3 != null)
				return false;
		} else if (!peopleRated3.equals(other.peopleRated3))
			return false;
		if (peopleRated4 == null) {
			if (other.peopleRated4 != null)
				return false;
		} else if (!peopleRated4.equals(other.peopleRated4))
			return false;
		if (peopleRated5 == null) {
			if (other.peopleRated5 != null)
				return false;
		} else if (!peopleRated5.equals(other.peopleRated5))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (primeDelivaery == null) {
			if (other.primeDelivaery != null)
				return false;
		} else if (!primeDelivaery.equals(other.primeDelivaery))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (rateing != other.rateing)
			return false;
		if (retunable == null) {
			if (other.retunable != null)
				return false;
		} else if (!retunable.equals(other.retunable))
			return false;
		if (returnBy == null) {
			if (other.returnBy != null)
				return false;
		} else if (!returnBy.equals(other.returnBy))
			return false;
		if (serialno == null) {
			if (other.serialno != null)
				return false;
		} else if (!serialno.equals(other.serialno))
			return false;
		if (warrenty == null) {
			if (other.warrenty != null)
				return false;
		} else if (!warrenty.equals(other.warrenty))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDescrpition() {
		return descrpition;
	}

	public void setDescrpition(String descrpition) {
		this.descrpition = descrpition;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public int getRateing() {
		return rateing;
	}

	public void setRateing(int rateing) {
		this.rateing = rateing;
	}

	public String getPeopleRated() {
		return peopleRated;
	}

	public void setPeopleRated(String peopleRated) {
		this.peopleRated = peopleRated;
	}

	public String getPeopleRated5() {
		return peopleRated5;
	}

	public void setPeopleRated5(String peopleRated5) {
		this.peopleRated5 = peopleRated5;
	}

	public String getPeopleRated4() {
		return peopleRated4;
	}

	public void setPeopleRated4(String peopleRated4) {
		this.peopleRated4 = peopleRated4;
	}

	public String getPeopleRated3() {
		return peopleRated3;
	}

	public void setPeopleRated3(String peopleRated3) {
		this.peopleRated3 = peopleRated3;
	}

	public String getPeopleRated2() {
		return peopleRated2;
	}

	public void setPeopleRated2(String peopleRated2) {
		this.peopleRated2 = peopleRated2;
	}

	public String getPeopleRated1() {
		return peopleRated1;
	}

	public void setPeopleRated1(String peopleRated1) {
		this.peopleRated1 = peopleRated1;
	}

	public String getPacker() {
		return packer;
	}

	public void setPacker(String packer) {
		this.packer = packer;
	}

	public Double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
	}

	public String getIncluded() {
		return included;
	}

	public void setIncluded(String included) {
		this.included = included;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public LocalDate getAvaliabledate() {
		return avaliabledate;
	}

	public void setAvaliabledate(LocalDate avaliabledate) {
		this.avaliabledate = avaliabledate;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	public String getCountryofOrigin() {
		return countryofOrigin;
	}

	public void setCountryofOrigin(String countryofOrigin) {
		this.countryofOrigin = countryofOrigin;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public Double getSerialno() {
		return serialno;
	}

	public void setSerialno(Double serialno) {
		this.serialno = serialno;
	}

	public String getRetunable() {
		return retunable;
	}

	public void setRetunable(String retunable) {
		this.retunable = retunable;
	}

	public String getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

	public String getPrimeDelivaery() {
		return primeDelivaery;
	}

	public void setPrimeDelivaery(String primeDelivaery) {
		this.primeDelivaery = primeDelivaery;
	}

	public LocalDate getDeliveryExpectedate() {
		return deliveryExpectedate;
	}

	public void setDeliveryExpectedate(LocalDate deliveryExpectedate) {
		this.deliveryExpectedate = deliveryExpectedate;
	}

	public LocalDate getReturnBy() {
		return returnBy;
	}

	public void setReturnBy(LocalDate returnBy) {
		this.returnBy = returnBy;
	}

	@Override
	public int compareTo(ProductDTO arguments) {
		ProductDTO current =this;
		if(this.id==arguments.id) {
			return 0;
		}
		if(this.id>arguments.id) {
			return 11;
		}
		if(this.id<arguments.id) {
			return -11;
		}	
		return 0;
	}
	
	

}
