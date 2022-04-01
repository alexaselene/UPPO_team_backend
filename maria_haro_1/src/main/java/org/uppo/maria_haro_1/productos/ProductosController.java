package org.uppo.maria_haro_1.productos;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="/api/productos/")
@CrossOrigin(origins="*") 


public class ProductosController {
	
	
	private final ProductosService productosService;
	@Autowired //auto conectalo
	 public ProductosController(ProductosService productosService) {
		 this.productosService = productosService;
	 }//constructor
	
	@GetMapping
	public ArrayList<Productos> getproductos() {
		
	return productosService.getproductos();	
		}//getProductos
	
	
	
	@GetMapping(path="{prodId}")
	public Productos getProducto(@PathVariable("prodId") Long prodId) {
		
		return productosService.getProductos(prodId);
	}//getPoducto	
	
	
	@DeleteMapping(path="{prodId}")
	public Productos deleteProducto(@PathVariable("prodId") Long prodId) {
		return productosService.deleteProducto(prodId);
		
	}//deleteProducto
	
	
	@PostMapping
	public Productos addProducto(@RequestBody Productos productos) {
		return productosService.addProducto(productos);
	}//addProducto
	
	
	@PutMapping(path="{prodId}")
	//http://localhost:8080/api/precio_producto/4?precio=68.74
	public Productos updateProducto(@PathVariable("prodId") Long prodId,
			
	@RequestParam(required=false)String nombre,
	@RequestParam(required=false)String caracteristicas,
	@RequestParam(required=false)double precio_producto,
	@RequestParam(required=false)int stock,
	@RequestParam(required=false)String imagen ){
	return	productosService.updateProducto(prodId, nombre, caracteristicas, precio_producto, stock, imagen);
		
	}//updateProducto
	

}//class ProductosController