package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * table in database
 *
 */
@Entity
public class Spectacles {
	@Id
	/**
	 * mapping spectacles_Id field
	 */
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="spectacles_seq")
	@SequenceGenerator(name="spectacles_seq",sequenceName="spectacles_seq",allocationSize=1)
	@Column(name="spectacles_Id")
private int spectaclesId;
	
	/**
	 * mapping spectacles_Number field
	 */
	@Column(name="spectacles_Number")
private String spectaclesNumber;
	
	/**
	 * mapping spectacles_Model field
	 */
	@Column(name="spectacles_Model")
private String spectaclesModel;
	
	/**
	 * mapping spectacles_Description field
	 */
	@Column(name="spectacles_Description")
private String spectaclesDescription;
	
	/**
	 * @param spectacles_Cost
	 */
	@Column(name="spectacles_Cost")
private double spectaclesCost;
	
	/**
	 * 
	 * @return spectaclesId
	 */
	public int getSpectaclesId() {
		return spectaclesId;
	}
	/**
	 * 
	 * @param spectaclesId
	 */
	public void setSpectaclesId(int spectaclesId) {
		this.spectaclesId = spectaclesId;
	}
	/**
	 * 
	 * @return spectaclesNumber
	 */
	public String getSpectaclesNumber() {
		return spectaclesNumber;
	}
	/**
	 * 
	 * @param spectaclesNumber
	 */
	public void setSpectaclesNumber(String spectaclesNumber) {
		this.spectaclesNumber = spectaclesNumber;
	}
	/**
	 * 
	 * @return spectaclesModel
	 */
	public String getSpectaclesModel() {
		return spectaclesModel;
	}
	/**
	 * 
	 * @param spectaclesModel
	 */
	public void setSpectaclesModel(String spectaclesModel) {
		this.spectaclesModel = spectaclesModel;
	}
	/**
	 * 
	 * @return spectaclesDescription
	 */
	public String getSpectaclesDescription() {
		return spectaclesDescription;
	}
	/**
	 * 	
	 * @param spectaclesDescription
	 */
	public void setSpectaclesDescription(String spectaclesDescription) {
		this.spectaclesDescription = spectaclesDescription;
	}
	/**
	 * 
	 * @return spectaclesCost
	 */
	public double getSpectaclesCost() {
		return spectaclesCost;
	}
  /**
   * 
   * @param spectaclesCost
   */
	public void setSpectaclesCost(double spectaclesCost) {
		this.spectaclesCost = spectaclesCost;
	}
	/**
	 * Constructor without parameters
	 */	
	public Spectacles() {
	
	}
}
