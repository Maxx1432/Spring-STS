package com.maxx.cars;

import org.springframework.stereotype.Component;

import com.maxx.intefaces.Car;
@Component("alto")
public class Alto implements Car {

	public String specs() {
		
		return "Hatchback from Suzuki";
	}

}
