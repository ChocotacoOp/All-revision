
package com.masai.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class FIR {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer firId;
    @NotNull
	String crimeDetails;
    @NotNull
    LocalDateTime firTime;
    @NotBlank
	String policeStation;
    @ManyToMany 
    private List<User> firMadeOn;
	public FIR() {
		// TODO Auto-generated constructor stub
	}
	public Integer getFirId() {
		return firId;
	}
	public void setFirId(Integer firId) {
		this.firId = firId;
	}
	public String getCrimeDetails() {
		return crimeDetails;
	}
	public void setCrimeDetails(String crimeDetails) {
		this.crimeDetails = crimeDetails;
	}
	public LocalDateTime getFirTime() {
		return firTime;
	}
	public void setFirTime(LocalDateTime firTime) {
		this.firTime = firTime;
	}
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	public List<User> getFirMadeOn() {
		return firMadeOn;
	}
	public void setFirMadeOn(List<User> firMadeOn) {
		this.firMadeOn = firMadeOn;
	}
	
	

    
}
