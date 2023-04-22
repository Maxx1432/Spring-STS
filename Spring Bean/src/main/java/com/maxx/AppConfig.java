package com.maxx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.maxx.cars.Alto;
import com.maxx.cars.Swift;
import com.maxx.specs.VDI;
import com.maxx.specs.VXI;

@Configuration
@ComponentScan("com.maxx")
public class AppConfig {
	
	@Bean("mySwift")
	public Swift swift() {
			return new Swift();
		}
	
	@Bean("alto")
	public Alto alto() {
		return new Alto();
	}
	
	@Bean("VDI")
	public VDI vdi() {
		return new VDI();
	}
	
	@Bean("VXI")
	public VXI vxi() {
		return new VXI();
	}
}
