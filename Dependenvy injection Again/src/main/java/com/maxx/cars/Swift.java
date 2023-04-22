package com.maxx.cars;

import org.springframework.stereotype.Component;

import com.maxx.intefaces.Car;
@Component
public class Swift implements Car {

	
	public String specs() {
		return "Sidan from Suzuki";
	}

}
