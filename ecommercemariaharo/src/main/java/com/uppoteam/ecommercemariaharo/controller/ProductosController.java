package com.uppoteam.ecommercemariaharo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.uppoteam.ecommercemariaharo.model.Productos;
import com.uppoteam.ecommercemariaharo.service.ProductosService;





@RestController
@RequestMapping(path="/api/productos")
public class ProductosController {
	
	
	private final ProductosService prodservice;
	@Autowired
	
	
public ProductosController(ProductosService prodservice) {
		
		this.prodservice = prodservice;
	}//constructor
	
	
	
	@GetMapping
	public List<Productos> getProductos() {
		return prodservice.getProductos();
	}//getProductos
	
 
	@GetMapping (path="{prodId}")
	public Productos getProducto(@PathVariable("prodId") Long id) {
		return prodservice.getProducto(id);
	}//getProductos
	
	@DeleteMapping(path="{prodId}")
	public Productos deleteProductos(@PathVariable("prodId") Long id) {
		return prodservice.deleteProductos(id);
	
	}//deleteProducto
	
	@PostMapping
	public Productos addProducto(@RequestBody Productos productos) {
		return prodservice.addProducto(productos);
	}// addProducto
	
	
	 @PutMapping(path="{prodId}")
	 public Productos updateProducto(@PathVariable("prodId") Long id,
			 @RequestParam(required = false)String nombre,
			 @RequestParam(required = false)String caracteristicas,
			 @RequestParam(required = false)Double precio_producto,
			 @RequestParam(required = false)Integer stock,
			 @RequestParam(required = false)String imagen) {
		   return prodservice.updateProducto( id, nombre , caracteristicas,precio_producto, stock, imagen );
		 
	 }// updateProducto
	
	
	
	
}