package com.xworkz.collectionSorting.dto;

public class TowerDTO  implements Comparable<TowerDTO>{
	
	private int id;
	
	public TowerDTO(int id, String name, String place, int hight, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.hight = hight;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String place;
	private int hight;
	private double cost;
	
	public TowerDTO() {
	
	}

	public TowerDTO(String name, String place, int hight, double cost) {
		super();
		this.name = name;
		this.place = place;
		this.hight = hight;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "TowerDTO [id=" + id + ", name=" + name + ", place=" + place + ", hight=" + hight + ", cost=" + cost
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + hight;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
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
		TowerDTO other = (TowerDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (hight != other.hight)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int compareTo(TowerDTO arguments) {
		TowerDTO current=this;
		if(current.hight==arguments.hight)
		{
			return 0;
		}
		if(current.hight<arguments.hight) {
			return 7687;
		}
		if(current.hight>arguments.hight) {
			return -13;
		}
		
		return 0;
	}

}
