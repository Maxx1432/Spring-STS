package com.maxx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maxx.cars.Alto;
import com.maxx.cars.Swift;
import com.maxx.intefaces.Car;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	
		Car myCar = context.getBean("alto",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
