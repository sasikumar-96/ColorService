package com.color.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COLORS")
public class ColorEntity {

	@Id
	@Column(name="COLOR_ID")
	private Integer colorId;
	
	@Column(name="COLOR_NAME")
	private String colorName;
	
	@Column(name="MODEL_ID")
	private Integer modelId;
	
	@Column(name="PRICE")
	private double price;

	public Integer getColorId() {
		return colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ColorEntity(Integer colorId, String colorName, Integer modelId, double price) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
		this.modelId = modelId;
		this.price = price;
	}

	public ColorEntity() {
		super();
	}
	
	
}
