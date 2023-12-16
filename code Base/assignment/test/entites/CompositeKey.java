package com.assignment.test.entites;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CompositeKey implements Serializable
{
	@Column(name = "Make_ID_PK")
	private int makeId;
	@Column(name = "Model_ID_PK")
	private int modelId;
	
	
	
	public CompositeKey(int makeId, int modelId) {
		super();
		this.makeId = makeId;
		this.modelId = modelId;
	}

	
	

	public int getMakeId() {
		return makeId;
	}
	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	
	
	
	
		@Override
	public int hashCode() {
		return Objects.hash(makeId, modelId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeKey other = (CompositeKey) obj;
		return makeId == other.makeId && modelId == other.modelId;
	}
	
	public CompositeKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
																		
																		
}














