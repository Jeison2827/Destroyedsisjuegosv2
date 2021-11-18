package co.edu.unbosque.model;
import java.io.Serializable;
public class DTOPartida implements Serializable {
	
		private String tipoPartida;
		private DTOJugador Jugador1;
		private DTOJugador Jugador2;
		
		public DTOPartida () {
			
			this.Jugador1 = new DTOJugador(); 
			this.Jugador2 = new DTOJugador();
			this.tipoPartida = "";
		}
		
		public DTOPartida (String tipoPartida, DTOJugador pJugador1, DTOJugador pJugador2) {
			
			
			this.Jugador1 =pJugador1; 
			this.Jugador2 = pJugador2;
			this.tipoPartida = tipoPartida;
		}


		public String getTipoPartida() {
			return tipoPartida;
		}


		public void setTipoPartida(String tipoPartida) {
			this.tipoPartida = tipoPartida;
		}


		public DTOJugador getJugador1() {
			return Jugador1;
		}


		public void setJugador1(DTOJugador jugador1) {
			Jugador1 = jugador1;
		}


		public DTOJugador getJugador2() {
			return Jugador2;
		}


		public void setJugador2(DTOJugador jugador2) {
			Jugador2 = jugador2;
		}


		@Override
		public String toString() {
			return "DTOPartida [tipoPartida=" + tipoPartida + ", nombre Jugador Uno=" + Jugador1.getNombre() + ", puntaje jugador Uno =" + Jugador1.getPuntaje() + ", Nombre Jugador Dos=" + Jugador2.getNombre() + ", puntaje jugador Dos =" + Jugador2.getPuntaje() +  "]";
		}
			
}