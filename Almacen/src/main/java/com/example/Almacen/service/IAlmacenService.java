package com.example.Almacen.service;

import java.util.List;

import com.example.Almacen.model.Almacen;

public interface IAlmacenService {
	
	public void crearAlmacen(Almacen almacen);
	public List<Almacen> listar();

}
