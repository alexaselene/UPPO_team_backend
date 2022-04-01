package org.uppo.maria_haro_1.productos;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class ProductosService {

public final ArrayList<Productos> lista= new ArrayList<Productos>();
	
	public ProductosService() {
		
		lista.add(new Productos("Happy Doggo", "Taza de color beige con asa color azul claro, tamaño mediano", 200.0, 3, "taza_perro.jpg")
        		);
        lista.add(new Productos("Lunática", "Taza de color blanco, texura rugosa, tamaño mediano", 250.0, 6, "taza_lunar.jpg")
        		);
		lista.add( new Productos("Ying Cat", "Taza de color blanco con asa color rosa, tamaño mediano", 250.0, 1, "taza_gatitas.jpg")
				);
		lista.add( new Productos("Estilo Olmeca", "Taza de color verde, estilo olmeca, asa color rojo,  tamaño mediano", 200.0, 2, "taza_cara.jpg"));
		
		
	}//constructor

	public ArrayList<Productos> getproductos() {
		return lista;
	}//getProductos

	public Productos getProductos(Long prodId) {
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
		}//foreach
		
		return tmpProd;	
	
	
	
	}//Productos deleteProducto
	
	
	
	public Productos addProducto(Productos producto) {
		lista.add(producto);	
		return producto ;
	}//addProducto

	public Productos updateProducto(Long prodId, String nombre, String caracteristicas, double precio_producto,
			int stock, String imagen) {
		Productos tmpProd = null;
		for (Productos producto : lista) {
			if (producto.getId() == prodId) {
				if (nombre != null)
					producto.setNombre(nombre);
				if (caracteristicas != null)
					producto.setCaracteristicas(caracteristicas);
				if (precio_producto > 0)
					producto.setPrecio_producto(precio_producto);
				if (stock > 0)
					producto.setStock(stock);
				if (imagen != null)
					producto.setImagen(imagen);
				tmpProd = producto;
				break;
			} // if
		} // foreaCh

		return tmpProd;

	}// updateProductos
	
}//class ProductosService