package com.uppoteam.ecommercemariaharo.model;

public class Pedidos {
	
		private String fecha;
		private String estado;
		private int id;
		private static int total=0;
		
		
		public Pedidos(String fecha, String estado) {
			this.fecha = fecha;
			this.estado = estado;
			total++;
			this.id = total;
		}///Constructor


		public Pedidos() {
			
		}//Pedidos


		public String getFecha() {
			return fecha;
		}//getFecha


		public void setFecha(String fecha) {
			this.fecha = fecha;
		}//setFecha


		public String getEstado() {
			return estado;
		}///getEstado


		public void setEstado(String estado) {
			this.estado = estado;
		}//setEstado


		public int getId() {
			return id;
		}// getId


		@Override
		public String toString() {
			return "Pedidos [fecha=" + fecha + ", estado=" + estado + ", id=" + id + "]";
		} //toString
		
		
		
		
		



	
	
	

}//class Pedidos
