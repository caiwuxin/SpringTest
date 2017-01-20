package com.test.paditang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.paditang.entity.Car;

@Configuration
public class Beans {

	@Bean(name="car")
	public Car buildCar(){
		Car car = new Car();
		car.setBrand("BYD");
		car.setColor("white");
		car.setMaxSpeed(200);
		return car;
	}
}
