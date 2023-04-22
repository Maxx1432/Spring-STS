package com.maxx.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.maxx.intefaces.Car;
import com.maxx.intefaces.Engine;

public class Swift implements Car {
	
	@Autowired
	@Qualifier("engineType")
	Engine engine;
	
	/*public Swift(Engine engine) {
		engine.type="New VXI Cons Engine";
		this.engine = engine;
	}*/

	public String specs() {
		String specs = "Sidan from Suzuki with engine type as "+engine.type();
		return specs;
	}



}
