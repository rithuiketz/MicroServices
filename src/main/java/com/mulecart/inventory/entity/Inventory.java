package com.mulecart.inventory.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventory")
public class Inventory extends BaseEntity {

	private String name;

	private Double price;

	private String brand;

	private String color;

	private String sku;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ sku :" + sku + "; Name : " + this.name + " Brand : "
				+ this.brand + "; Color:" + this.color + "; Price : "+this.price+" Deleted : "+super.getDeletedTime()+" }";
	}
}
