package com.example.Almacen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Almacen.model.Almacen;
import com.example.Almacen.service.IAlmacenService;

@RestController
public class Controlador {
	
	@Autowired
	IAlmacenService almacenService;
	
	@PostMapping("/guardar")
	public void crearAlmacen(@RequestBody Almacen almacen) {
		almacenService.crearAlmacen(almacen);
	}
	
	
	@GetMapping("/listar")
	public List<Almacen> listarAlmacenes() {
		return almacenService.listar();
	}

}
