package com.maxx.specs;

import org.springframework.stereotype.Component;

import com.maxx.intefaces.Engine;

public class EngineType implements Engine {
	String type;
	
	
	public EngineType() {
	type = "unknown";
	}


	public EngineType(String type) {
		this.type = type;
	}


	@Override
	public String type() {
		// TODO Auto-generated method stub
		return type;
	}

}
