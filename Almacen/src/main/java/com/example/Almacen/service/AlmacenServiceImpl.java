package com.example.Almacen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Almacen.model.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	List<Almacen> listaAlmacenes =  new ArrayList<>();

	@Override
	public void crearAlmacen(Almacen almacen) {
		listaAlmacenes.add(almacen);
		
	}

	@Override
	public List<Almacen> listar() {
		return listaAlmacenes;
	}

}
