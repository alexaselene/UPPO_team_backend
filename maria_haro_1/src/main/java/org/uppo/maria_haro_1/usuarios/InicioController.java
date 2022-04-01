package org.uppo.maria_haro_1.usuarios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/api/inicio/")
@CrossOrigin
public class InicioController {
	private final RegistroService registroService;
	
	@Autowired
	public InicioController(RegistroService registroService) {
		this.registroService = registroService;
	}
	
	public final ArrayList<Usuarios> registrados = new ArrayList<Usuarios>();
	
	/*@PostMapping
	public Usuarios inicioUsuario(@RequestParam String nombre_usuario,
			@RequestParam String contraseña) {
		return registroService.inicioUsuario(nombre_usuario, contraseña);
	}*/
	
	@PostMapping
	public Usuarios inicioUsuario(@RequestBody Usuarios usuario) {
		return registroService.inicioUsuario(usuario);
	}
	
}

