package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CountryDTO implements Serializable{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalcity == null) ? 0 : capitalcity.hashCode());
		result = prime * result + id;
		result = prime * result + ((independenceDate == null) ? 0 : independenceDate.hashCode());
		result = prime * result + independent;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nationalAnimal == null) ? 0 : nationalAnimal.hashCode());
		result = prime * result + ((nationalBird == null) ? 0 : nationalBird.hashCode());
		result = prime * result + ((nationalSports == null) ? 0 : nationalSports.hashCode());
		result = prime * result + noOfStates;
		result = prime * result + (int) (populaction ^ (populaction >>> 32));
		result = prime * result + ((primaryReligion == null) ? 0 : primaryReligion.hashCode());
		result = prime * result + ((primeMinester == null) ? 0 : primeMinester.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (capitalcity == null) {
			if (other.capitalcity != null)
				return false;
		} else if (!capitalcity.equals(other.capitalcity))
			return false;
		if (id != other.id)
			return false;
		if (independenceDate == null) {
			if (other.independenceDate != null)
				return false;
		} else if (!independenceDate.equals(other.independenceDate))
			return false;
		if (independent != other.independent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationalAnimal == null) {
			if (other.nationalAnimal != null)
				return false;
		} else if (!nationalAnimal.equals(other.nationalAnimal))
			return false;
		if (nationalBird == null) {
			if (other.nationalBird != null)
				return false;
		} else if (!nationalBird.equals(other.nationalBird))
			return false;
		if (nationalSports == null) {
			if (other.nationalSports != null)
				return false;
		} else if (!nationalSports.equals(other.nationalSports))
			return false;
		if (noOfStates != other.noOfStates)
			return false;
		if (populaction != other.populaction)
			return false;
		if (primaryReligion == null) {
			if (other.primaryReligion != null)
				return false;
		} else if (!primaryReligion.equals(other.primaryReligion))
			return false;
		if (primeMinester == null) {
			if (other.primeMinester != null)
				return false;
		} else if (!primeMinester.equals(other.primeMinester))
			return false;
		return true;
	}

	private int id;
	private String name;
	private String capitalcity;
	private long populaction;
	private int independent;
	private LocalDate independenceDate;
	private int noOfStates;
	private String primaryReligion;
	private String nationalAnimal;
	private String nationalBird;
	private String nationalSports;
	private String primeMinester;
	
	public CountryDTO() {
		
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", capitalcity=" + capitalcity + ", populaction="
				+ populaction + ", independent=" + independent + ", independenceDate=" + independenceDate
				+ ", noOfStates=" + noOfStates + ", primaryReligion=" + primaryReligion + ", nationalAnimal="
				+ nationalAnimal + ", nationalBird=" + nationalBird + ", nationalSports=" + nationalSports
				+ ", primeMinester=" + primeMinester + "]";
	}

	public CountryDTO(int id, String name, String capitalcity, long populaction, int independent,
			LocalDate independenceDate, int noOfStates, String primaryReligion, String nationalAnimal,
			String nationalBird, String nationalSports, String primeMinester) {
		super();
		this.id = id;
		this.name = name;
		this.capitalcity = capitalcity;
		this.populaction = populaction;
		this.independent = independent;
		this.independenceDate = independenceDate;
		this.noOfStates = noOfStates;
		this.primaryReligion = primaryReligion;
		this.nationalAnimal = nationalAnimal;
		this.nationalBird = nationalBird;
		this.nationalSports = nationalSports;
		this.primeMinester = primeMinester;
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

	public String getCapitalcity() {
		return capitalcity;
	}

	public void setCapitalcity(String capitalcity) {
		this.capitalcity = capitalcity;
	}

	public long getPopulaction() {
		return populaction;
	}

	public void setPopulaction(long populaction) {
		this.populaction = populaction;
	}

	public int getIndependent() {
		return independent;
	}

	public void setIndependent(int independent) {
		this.independent = independent;
	}

	public LocalDate getIndependenceDate() {
		return independenceDate;
	}

	public void setIndependenceDate(LocalDate independenceDate) {
		this.independenceDate = independenceDate;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getPrimaryReligion() {
		return primaryReligion;
	}

	public void setPrimaryReligion(String primaryReligion) {
		this.primaryReligion = primaryReligion;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	public String getNationalBird() {
		return nationalBird;
	}

	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}

	public String getNationalSports() {
		return nationalSports;
	}

	public void setNationalSports(String nationalSports) {
		this.nationalSports = nationalSports;
	}

	public String getPrimeMinester() {
		return primeMinester;
	}

	public void setPrimeMinester(String primeMinester) {
		this.primeMinester = primeMinester;
	}

}
