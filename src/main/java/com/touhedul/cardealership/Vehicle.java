package com.touhedul.cardealership;

public class Vehicle {
    private String make;
    private String model;
    private double price;
    private int size;
    private String trim;
    
    
	public Vehicle(String make, String model, double price, int size, String trim) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.size = size;
		this.trim = trim;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", size=" + size + ", trim=" + trim
				+ "]";
	}
	
    
}
