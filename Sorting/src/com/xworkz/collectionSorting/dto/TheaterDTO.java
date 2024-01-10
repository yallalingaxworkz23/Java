package com.xworkz.collectionSorting.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {
	
	private int id;
	private String name;
	private int sets;
	private String place;
	
	public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public TheaterDTO(int id, String name, int sets, String place) {
		super();
		this.id = id;
		this.name = name;
		this.sets = sets;
		this.place = place;
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", sets=" + sets + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + sets;
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
		TheaterDTO other = (TheaterDTO) obj;
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
		if (sets != other.sets)
			return false;
		return true;
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

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int compareTo(TheaterDTO arguments) {
		if(this.sets==arguments.sets) {
			return 0;
		}
		if(this.sets>arguments.sets) {
			return 22;
		}
		if(this.sets<arguments.sets) {
			return -22;
		}
		return 0;
	}

}
