package modelo.clasesDatos;

import java.io.Serializable;
import java.util.regex.Pattern;

import modelo.enumeraciones.Especialidad;

public class Medico extends Persona implements Serializable{
	private Especialidad especialidad;
	
	public Medico(String nombre, String apellidos,String telefono, String direccion, String idUnico, Especialidad especialidad) {
		super(nombre, apellidos, telefono, direccion, idUnico);
		this.setEspecialidad(especialidad);
	}
	
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	
}
