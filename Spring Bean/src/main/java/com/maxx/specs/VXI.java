package com.maxx.specs;

import org.springframework.stereotype.Component;

import com.maxx.intefaces.Engine;

public class VXI implements Engine {

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "VXI Engine";
	}

}
