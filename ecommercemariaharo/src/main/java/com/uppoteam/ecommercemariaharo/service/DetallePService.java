package com.uppoteam.ecommercemariaharo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uppoteam.ecommercemariaharo.model.DetallePedido;

@Service
public class DetallePService {
	
	private final DetallePRepository detallePRepository;
	
	@Autowired
	public DetallePService(DetallePRepository detallePRepository) {
		this.detallePRepository = detallePRepository;
	}

	// GET
	public List<DetallePedido> getDetallePedidos() {
		return detallePRepository.findAll();
	}

	public DetallePedido getDetallePedido(Long id) {
		return detallePRepository.findById(id).orElseThrow(
				()-> new IllegalStateException("La orden de pedido con el id " + id + "no existe."));
	}

	public DetallePedido deleteDetallePedido(Long id) {
		DetallePedido det_p_del = null;
		if (detallePRepository.existsById(id)) {
			det_p_del = detallePRepository.findById(id).get();
			detallePRepository.deleteById(id);
		}
		return det_p_del;
	}
    
	//POST
	public DetallePedido addDetallePedido (DetallePedido detallep) {
		// TODO Auto-generated method stub
		detallePRepository.save(detallep);
		return  detallep;
	}

	//PUT
	public DetallePedido updateDetallePedido(Long id, Integer cantidad) {
		   DetallePedido detalle_p= null;
		   if (detallePRepository.existsById(id)) {
			   detalle_p=detallePRepository.findById(id).get();
			   if ( (cantidad!=null) && (cantidad>=0) ) detalle_p.setCantidad(cantidad);
			   detallePRepository.save(detalle_p);
		   }else {
			   System.out.println("La orden de pedido no existe con el id"+id );
		   }//else
		
		return detalle_p;
	}

}
