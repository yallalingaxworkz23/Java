package com.xworkz.collectionSorting.dto;

public class OceanDTO  implements Comparable<OceanDTO>{
	private int id;
	private String name;
	private String plcae;
	private int deepth;
	public OceanDTO() {
		
	}
	public OceanDTO(int id, String name, String plcae, int deepth) {
		super();
		this.id = id;
		this.name = name;
		this.plcae = plcae;
		this.deepth = deepth;
	}
	@Override
	public String toString() {
		return "OceanDTO [id=" + id + ", name=" + name + ", plcae=" + plcae + ", deepth=" + deepth + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deepth;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((plcae == null) ? 0 : plcae.hashCode());
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
		OceanDTO other = (OceanDTO) obj;
		if (deepth != other.deepth)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (plcae == null) {
			if (other.plcae != null)
				return false;
		} else if (!plcae.equals(other.plcae))
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
	public String getPlcae() {
		return plcae;
	}
	public void setPlcae(String plcae) {
		this.plcae = plcae;
	}
	public int getDeepth() {
		return deepth;
	}
	public void setDeepth(int deepth) {
		this.deepth = deepth;
	}
	@Override
	public int compareTo(OceanDTO arguments) {
		if(this.deepth==arguments.deepth) {
			return 0;
		}
		if(this.deepth>arguments.deepth) {
			return 34;
		}
		if(this.deepth<arguments.deepth) {
			return -12;
		}
		
		return 0;
	}

}
