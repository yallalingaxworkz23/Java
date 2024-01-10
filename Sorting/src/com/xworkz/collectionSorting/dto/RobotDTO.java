package com.xworkz.collectionSorting.dto;

import java.util.Comparator;
import java.util.InputMismatchException;

public class RobotDTO  implements Comparable<RobotDTO>{
	private int id;
	private String name;
	private String place;
	private double cost;

	public RobotDTO() {
		// TODO Auto-generated constructor stub
	}

	public RobotDTO(int id, String name, String place, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "RobotDTO [id=" + id + ", name=" + name + ", place=" + place + ", cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		RobotDTO other = (RobotDTO) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int compare(RobotDTO o1) {
		RobotDTO robo=this;
		
		if(robo.cost==o1.cost) {
			return 0;
		}
		if(robo.cost>o1.cost) {
			return 11;
		}
		if(robo.cost<o1.cost) {
			return -11;
		}
		
		return 0;
		
	}

	

	@Override
	public int compareTo(RobotDTO o) {
		if(this.cost==o.cost)
		{
			return 0;
		}
		if(this.cost>o.cost)
			return 34567;
		if(this.cost<o.cost)
			return -4567;
		throw new InputMismatchException();
		
		
	}
}
