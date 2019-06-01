package modelo.clasesDatos;

import java.util.regex.Pattern;

import modelo.enumeraciones.Especialidad;

public class Medico extends Persona{
	private Especialidad especialidad;
	
	public Medico(String nombre, String telefono, String direccion, String idUnico, Especialidad especialidad) {
		super(nombre, telefono, direccion, idUnico);
		this.setEspecialidad(especialidad);
	}

	public Medico(Medico leido) 
	{
		super(leido.getNombre(), leido.getTelefono(), leido.getDireccion(), leido.getIdUnico());
		this.setEspecialidad(leido.getEspecialidad());
	}
	
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	
}