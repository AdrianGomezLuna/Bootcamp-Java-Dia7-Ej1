package model;

public class Persona {
	
	public String name;
	
	private static Persona persona;

	public Persona() {	}
	
	
	public static Persona getInstance() {
		
		if(persona == null) {
			persona = new Persona();
		}
		
		return persona;
	}
	
	
	public void persona(String mensaje) {
		System.out.println(mensaje);
	}

}
