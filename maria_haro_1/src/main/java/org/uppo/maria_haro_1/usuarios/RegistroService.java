package org.uppo.maria_haro_1.usuarios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class RegistroService {
	public final ArrayList<Usuarios> registrados = new ArrayList <Usuarios> ();

	public RegistroService() {
		registrados.add(new Usuarios("colindiana6c@gmail.com", 
				"Diana99.", 
				"Diana Carolina Colín Ochoa", 
				"3531093907"));
		registrados.add(new Usuarios("alexa.selene25.com", 
				"Alexa.123", 
				"Alexa Selene Alcántara Torres",
				"5627578707"));
		registrados.add(new Usuarios("maricruz.bautista1229@gmail.com",
				"Maricruz.123",
				"Maricruz Bautista",
				"5575459288"));
		registrados.add(new Usuarios("hercules_de_100@outlook.com",
				"Hercules123#", 
				"José García Ramírez",
				"5576475525"));
		registrados.add(new Usuarios("amizaday.hean@gmail.com",
				"Hean*123",
				"Amizaday Hernández",
				"5519627590"));
	} // Constructor
	
	public ArrayList<Usuarios> getUsuarios() {
		return registrados;
	} // getProductos
	
	public Usuarios getUsuario(Long usuarioId) {
		Usuarios usuario_temp = null;
		for (Usuarios usuario : registrados) {
			if (usuario.getId() == usuarioId) {
				usuario_temp = usuario;
				break;
			}
		}
		return usuario_temp;
	}
	
	public Usuarios addUsuario(Usuarios usuario) {
		registrados.add(usuario);
		return usuario;
	}

	public Usuarios inicioUsuario(Usuarios usuario) { 
		Usuarios tempUsuario = null;
		for(Usuarios usuario_c : registrados) {
			if(usuario.getNombre_usuario() == usuario_c.getNombre_usuario()) {
				tempUsuario = usuario_c;
			}
		}
		return tempUsuario;
	}
}