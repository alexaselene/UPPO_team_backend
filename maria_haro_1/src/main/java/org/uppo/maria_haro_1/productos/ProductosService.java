package org.uppo.maria_haro_1.productos;

import java.util.ArrayList;

import org.springframework.stereotype.Service;








@Service
public class ProductosService {

public final ArrayList<Productos> lista= new ArrayList<Productos>();
	
	public ProductosService() {
		
		lista.add(new Productos("dog alegre", "tasa mediana ceramica de un perro cerigrafiado", 250.50, 3, "src")
        		);

        lista.add(new Productos("gatitas", "tasa mediana ceramica de unas gatitas jugando cerigrafiado", 265.50, 6, "src")
        		);
		lista.add( new Productos("colibri", "tasa mediana ceramica de un colibri cerigrafiado", 260.50, 1, "src")
				);
		lista.add( new Productos("muerte floreando", "tasa mediana ceramica de una esqueleto con flores jugando", 265.50, 2, "src"));
		
		
	}//constructor

	public ArrayList<Productos> getproductos() {
		// TODO Auto-generated method stub
		return lista;
	}//getProductos

	public Productos getProductos(Long prodId) {
		// TODO Auto-generated method stub
		Productos tmpProd = null;
		for (Productos producto : lista) {
			if (producto.getId() == prodId) {
				tmpProd = producto;
			break;
			}//if
		}//foreaCh
		
		return tmpProd;
	}//getProducto

	public Productos deleteProducto(Long prodId) {
		
		Productos tmpProd = null;
		for (Productos producto : lista) {
			if (producto.getId() == prodId) {
				
				tmpProd = lista.remove(lista.indexOf(producto));
			break;
			}//if
		}//foreaCh
		
		return tmpProd;	
	
	
	
	}//Productos deleteProducto
	
	
	
public Productos addProducto(Productos producto) {
		
		lista.add(producto);
		
		return producto ;
	}//addProducto

public Productos updateProducto(Long prodId,
		String nombre, String caracteristicas, double precio_producto, int stock, String imagen) {
Productos tmpProd = null;
for (Productos producto : lista) {
	if (producto.getId() == prodId) {
		if(nombre!=null) producto.setNombre(nombre);
		if(caracteristicas!=null) producto.setCaracteristicas(caracteristicas);
		if(precio_producto>0) producto.setPrecio_producto(precio_producto);
		if(stock>0) producto.setStock(stock);
		if(imagen!=null) producto.setImagen(imagen);
		tmpProd = producto;
	break;
	}//if
}//foreaCh

return tmpProd;



}//updateProductos
	
}//class ProductosService