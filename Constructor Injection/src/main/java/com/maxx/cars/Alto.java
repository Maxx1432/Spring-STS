package com.maxx.cars;

import org.springframework.stereotype.Component;

import com.maxx.intefaces.Car;

public class Alto implements Car {

	public String specs() {
		
		return "hatchback from Suzuki";
	}
}
