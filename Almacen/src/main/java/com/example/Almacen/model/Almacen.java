package com.example.Almacen.model;

import java.io.Serializable;
import java.util.Date;



public class Almacen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private String fechaInaguracion;
	private int capacidadClientes;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getFechaInaguracion() {
		return fechaInaguracion;
	}
	public void setFechaInaguracion(String fechaInaguracion) {
		this.fechaInaguracion = fechaInaguracion;
	}
	
	public int getCapacidadClientes() {
		return capacidadClientes;
	}
	public void setCapacidadClientes(int capacidadClientes) {
		this.capacidadClientes = capacidadClientes;
	}
	
	
	

}
