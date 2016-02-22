package Escuelita;

public class Pasajero implements Persona{

	private String Nombre;
	
	private double Bonificacion;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String unNombre) {
		Nombre = unNombre;
	}
	
	public double getBonificacion(){
		return Bonificacion;
	}
	
	public void setBonificacion(double laBonificacion) {
		Bonificacion = laBonificacion;
	}
	

	public static void main(String args[]) {
		Pasajero UnPasajero = new Pasajero();
		EmpleadoDeDespegar UnEmpleado = new EmpleadoDeDespegar();
		UnEmpleado.setNombre("Federico");
		UnPasajero.setNombre("Tomas");
		UnPasajero.setBonificacion(0.21);
		CalculadorDePrecio MiCalculador = new CalculadorDePrecio();
		System.out.println(MiCalculador.CalcularPrecio(UnPasajero, 20));
	}
}
