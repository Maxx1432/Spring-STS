package com.maxx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maxx.cars.Alto;
import com.maxx.cars.Swift;
import com.maxx.intefaces.Car;

public class App {

	public static void main(String[] args) {
		Car swift = new Swift();
		Car alto = new Alto();
		
		//System.out.println(swift.specs());
		//System.out.println(alto.specs());
		
		//Car myCar = new Swift();
		//System.out.println(myCar.specs());
		
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	
		Car myCar = context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
