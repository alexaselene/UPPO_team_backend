package com.uppoteam.ecommercemariaharo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.Productos;






@Service
public class ProductosService {

	private final ProductosRepository productosRepository;
	
	@Autowired
	public ProductosService(ProductosRepository productosRepository) {
		
		this.productosRepository = productosRepository;
	}//constructo
	
	

	public List<Productos> getProductos(){
		return productosRepository.findAll();  
				
				
	}// getProductos
	
	
	public Productos getProducto(Long id) {
		return	productosRepository.findById(id).orElseThrow(
			() -> new IllegalStateException("El producto con el id" + id + "no existe")) ;
		
		}// getProductos
	
	
	public Productos  deleteProductos(Long id) {
		Productos tmpProductos=null;
	if	(productosRepository.existsById(id)) {
		tmpProductos = productosRepository.findById(id).get();
		productosRepository.deleteById(id);
	}//if
		return tmpProductos;
	}//deleteProduct0
	

	public Productos addProducto(Productos producto) {
		Productos tmpProducto = null;
		Optional<Productos> prodByName=productosRepository.findByNombre(producto.getNombre());
		if(prodByName.isPresent()) {
			throw new IllegalStateException("El Producto con el nombre [" + producto.getNombre() + 
					"] YA existe."); 	
		} else {
			productosRepository.save(producto);
			tmpProducto = producto;
		}//else 
		return tmpProducto;
	}//addProducto
	
	
	
	public Productos updateProducto(Long id, String nombre, String caracteristicas, Double precio_producto,Integer stock, String imagen ) {
		Productos tmpProducto= null;
		if	(productosRepository.existsById(id)) {
			tmpProducto = productosRepository.findById(id).get();
		if (nombre !=null)tmpProducto.setNombre(nombre);
		if (caracteristicas !=null)tmpProducto.setCaracteristicas(caracteristicas);
		if (precio_producto!=null && precio_producto.doubleValue()>0)tmpProducto.setPrecio_producto(precio_producto);
		if (stock!=null && stock.intValue()>0)tmpProducto.setStock(stock);
		if (imagen !=null)tmpProducto.setImagen(imagen);
		
		productosRepository.save(tmpProducto);
		
		
		}else {
			System.out.println("No existe el producto con el id" + id);
		}
			return tmpProducto;
		}//updateProducto
	
	
	
}