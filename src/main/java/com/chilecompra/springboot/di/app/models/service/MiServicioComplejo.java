package com.chilecompra.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

//@Component("miServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso simple complicado ...";
	}

}
