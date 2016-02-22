package Escuelita;

public class CalculadorDePrecio {
	public double CalcularPrecio(Persona unaPersona, int precioBase) {
		 double Precio = unaPersona.getBonificacion() * precioBase;
		 return Precio;
	}
}
