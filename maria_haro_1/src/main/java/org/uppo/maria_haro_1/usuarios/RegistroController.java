package org.uppo.maria_haro_1.usuarios;

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
@RequestMapping (path = "/api/usuarios/")
@CrossOrigin(origins="*")
public class RegistroController {

	private final RegistroService registroService;
	
	@Autowired
	public RegistroController(RegistroService registroService) {
		this.registroService = registroService;
	}
	
	public final ArrayList<Usuarios> registrados = new ArrayList <Usuarios> ();
	
	@GetMapping
	public ArrayList<Usuarios> getUsuarios() {
		return registroService.getUsuarios();
	}
	
	@GetMapping(path = "{usuarioId}")
	public Usuarios getUsuario(@PathVariable("usuarioId") Long usuarioId) {
		return registroService.getUsuario(usuarioId);
	}
	
	@PostMapping
	public Usuarios addUsuario (@RequestBody Usuarios usuario) {
		return registroService.addUsuario(usuario);
	}
}
