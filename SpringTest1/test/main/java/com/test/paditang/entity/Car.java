package com.test.paditang.entity;

public class Car {

	private String brand;
	private String color;
	private int maxSpeed;
	
	public Car(){}
	
	public Car(String brand,String color,int maxSpeed){
		this.brand=brand;
		this.color=color;
		this.maxSpeed=maxSpeed;
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

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String introduceThisCar(){
		String introduce =  "the car's brand is :"
							+ brand+"and color is :"+color
							+"and it can run max to "+maxSpeed;
		System.out.println(introduce);
		return introduce;
	}
}
