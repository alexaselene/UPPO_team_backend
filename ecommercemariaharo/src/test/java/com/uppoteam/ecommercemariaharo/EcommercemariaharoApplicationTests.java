package com.uppoteam.ecommercemariaharo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uppoteam.ecommercemariaharo.model.Productos;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;



@SpringBootTest
@AutoConfigureMockMvc
class EcommercemariaharoApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@Disabled("Deshabilitado temporalmente ")
	public void pruebaPut() throws Exception {
	this.mockMvc.perform(put("/api/productos/17").queryParam("nombre", "Happy Pastel")
			.header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjb2xpbmRpYW5hNmNAZ21haWwuY29tIiwicm9sZSI6InVzZXIiLCJpYXQiOjE2NDkzNDE0MDksImV4cCI6MTY0OTM3NzQwOX0.QfqapkFYNEBQe7_49Rsb-_j2Bob52JCe1RjeS_8wAG8"))
	.andDo(print()) 
	.andExpect(status().isOk())
	.andExpect(content().string(containsString("Happy")));
	}//pruebaPut
	
	@Test
	
	public void pruebaDelete() throws Exception {
		this.mockMvc.perform(delete("/api/productos/17").header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjb2xpbmRpYW5hNmNAZ21haWwuY29tIiwicm9sZSI6InVzZXIiLCJpYXQiOjE2NDkzNDE0MDksImV4cCI6MTY0OTM3NzQwOX0.QfqapkFYNEBQe7_49Rsb-_j2Bob52JCe1RjeS_8wAG8"))
		.andDo(print()) 
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Happy")));
		}//pruebaDelete
	
	@Test
	@Disabled("Deshabilitado temporalmente ")
	public void pruebaPost () throws Exception {
		Productos p = new Productos();
		p.setNombre("Happy Cats");
		p.setCaracteristicas("Taza de color beige con asa color azul claro, tamaño mediano");
		p.setPrecio_producto(200);
		p.setStock(3);
		p.setImagen("URL");
		p.setCategoria_idcategoria((long) 1);
		
		this.mockMvc.perform(post("/api/productos/").header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjb2xpbmRpYW5hNmNAZ21haWwuY29tIiwicm9sZSI6InVzZXIiLCJpYXQiOjE2NDkzNDE0MDksImV4cCI6MTY0OTM3NzQwOX0.QfqapkFYNEBQe7_49Rsb-_j2Bob52JCe1RjeS_8wAG8")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))).andExpect(status().isOk());
				
	}//pruebaPost
	public static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
 } // asJsonString

	@Test
	public void pruebaGets() throws Exception {
		this.mockMvc.perform(get("/api/productos/1"))
		.andDo(print()) 
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Happy")));
		
		//Producto 2
		this.mockMvc.perform(get("/api/productos/2"))
		.andDo(print()) 
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("rugosa")));
		//Producto 3
		this.mockMvc.perform(get("/api/productos/3"))
		.andDo(print()) 
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Cat")));
		//Producto 4
		this.mockMvc.perform(get("/api/productos/4"))
		.andDo(print()) 
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Estilo")));
		//Producto 5
		this.mockMvc.perform(get("/api/productos/5"))
		.andDo(print()) 
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("lunes")));
	}//PruebaGets
	@Test
	public void prueba404() throws Exception {
		this.mockMvc.perform(get("/api/producto/6"))
		.andExpect(status().isNotFound());
	}//PruebaNotFound
	
}//class EcommercemariaharoApplicationTests
