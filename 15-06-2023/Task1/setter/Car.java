package com.dal.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Car {

	@Value(value= "hundai")
	private String name;
	@Value("xyz")
	private String model;
	@Value("TN2358")
	private String carNum;
	
	
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", carNumber = " + carNum +"]";
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String model) {
		super();
		this.name = name;
		this.model = model;
		this.carNum = carNum;
	}
	
	

}
