package com.chilecompra.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.chilecompra.springboot.di.app.models.domain.ItemFactura;
import com.chilecompra.springboot.di.app.models.domain.Producto;
import com.chilecompra.springboot.di.app.models.service.IServicio;
import com.chilecompra.springboot.di.app.models.service.MiServicio;
import com.chilecompra.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Silla Escritorio", 100);
		Producto producto2 = new Producto("Pizarra Acrílica Magnética Blanca", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Silla Escritorio", 100);
		Producto producto2 = new Producto("Pizarra Acrílica Magnética Blanca", 200);
		Producto producto3 = new Producto("Impresora HP Multifuncional", 300);
		Producto producto4 = new Producto("Escritorio Oficina", 400);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}

}
