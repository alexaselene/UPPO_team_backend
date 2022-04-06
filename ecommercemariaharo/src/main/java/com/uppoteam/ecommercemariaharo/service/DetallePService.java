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

}
