package com.assignment.test.entites;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "assignment_data1")
public class Insurance {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	
//	private int makeId;
	
	
	
//	@Id
//	private int modelId;
	
	
	@EmbeddedId
    private CompositeKey compositeKey;
	
	@Column(name = "Make_Name")
	private String makeName;
	
	@Column(name = "Model_Name")
	private String modelName;
	
	@Column(name = "Variance")
	private String varinace;
	
	@Column(name = "Wheels")
	private int wheels;
	
	@Column(name = "Operated_By")
	private String operatedBy;
	
	@Column(name = "CC")
	private String cc;
	
	@Column(name = "Seating_Capacity")
	private int seatingCapacity;
	
	@Column(name = "Carrying_Capacity")
	private int carryingCapacity;
	
	@Column(name = "Veh_Type_ID_FK")
	private int vehTypeIdFk;
	
	@Column(name = "Veh_Type_Name")
	private String vehTypeName;
	
	
	

	
public Insurance(CompositeKey compositeKey, String makeName, String modelName, String varinace, int wheels,
			String operatedBy, String cc, int seatingCapacity, int carryingCapacity, int vehTypeIdFk,
			String vehTypeName) {
		super();
		this.compositeKey = compositeKey;
		this.makeName = makeName;
		this.modelName = modelName;
		this.varinace = varinace;
		this.wheels = wheels;
		this.operatedBy = operatedBy;
		this.cc = cc;
		this.seatingCapacity = seatingCapacity;
		this.carryingCapacity = carryingCapacity;
		this.vehTypeIdFk = vehTypeIdFk;
		this.vehTypeName = vehTypeName;
	}
		
	
	
	
	

	public CompositeKey getCompositeKey() {
	return compositeKey;
}






public void setCompositeKey(CompositeKey compositeKey) {
	this.compositeKey = compositeKey;
}






public String getMakeName() {
	return makeName;
}






public void setMakeName(String makeName) {
	this.makeName = makeName;
}






public String getModelName() {
	return modelName;
}






public void setModelName(String modelName) {
	this.modelName = modelName;
}






public String getVarinace() {
	return varinace;
}






public void setVarinace(String varinace) {
	this.varinace = varinace;
}






public int getWheels() {
	return wheels;
}






public void setWheels(int wheels) {
	this.wheels = wheels;
}






public String getOperatedBy() {
	return operatedBy;
}






public void setOperatedBy(String operatedBy) {
	this.operatedBy = operatedBy;
}






public String getCc() {
	return cc;
}






public void setCc(String cc) {
	this.cc = cc;
}






public int getSeatingCapacity() {
	return seatingCapacity;
}






public void setSeatingCapacity(int seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}






public int getCarryingCapacity() {
	return carryingCapacity;
}






public void setCarryingCapacity(int carryingCapacity) {
	this.carryingCapacity = carryingCapacity;
}






public int getVehTypeIdFk() {
	return vehTypeIdFk;
}






public void setVehTypeIdFk(int vehTypeIdFk) {
	this.vehTypeIdFk = vehTypeIdFk;
}






public String getVehTypeName() {
	return vehTypeName;
}






public void setVehTypeName(String vehTypeName) {
	this.vehTypeName = vehTypeName;
}







	public Insurance() {
	super();
	// TODO Auto-generated constructor stub
}






	@Override
	public String toString() {
		return "Insurance [makeName=" + makeName + ", modelName=" + modelName + ", varinace=" + varinace + ", wheels="
				+ wheels + ", operatedBy=" + operatedBy + ", cc=" + cc + ", seatingCapacity=" + seatingCapacity
				+ ", carryingCapacity=" + carryingCapacity + ", vehTypeIdFk=" + vehTypeIdFk + ", vehTypeName="
				+ vehTypeName + "]";
	}

	
	
	
	
	
	
	
	
}
