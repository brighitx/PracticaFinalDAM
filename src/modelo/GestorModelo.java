package modelo;

import java.util.HashMap;
import java.util.regex.Pattern;

import lecturaYEscritura.DAO;
import lecturaYEscritura.DTO;

public class GestorModelo {
	/*
	 * "Anytime you find yourself writing code of
	 * the from "if the object is of type T1, then do
	 * something, but if it�s of type T2, then do
	 * something else," slap yourself
	 * */
	HashMap<String, Paciente> pacientes = new HashMap<String, Paciente>();
	HashMap<String, Medico> medicos = new HashMap<String, Medico>();
	HashMap<String, MedicoActivo> medicosActivo = new HashMap<String, MedicoActivo>();
	HashMap<String, Cirujano> cirujanos = new HashMap<String, Cirujano>();
	
	DAO dao;
	DTO dto;
	public void cargarColeccionesMap(){
		/*	Leer todos los pacientes de pacientes.dat
		 * 		A�adir a personas
		 * 	Leer todos los medicos de medicos.dat
		 * 		A�adir a personas
		 * 	Leer todos los medicosActivos de medicosActivos.dat
		 * 		A�adir a personas
		 * 	Leer todos los cirujanos de cirujanos.dat
		 * 		A�adir a personas
		 * */
	}
	
	
	//personas.put(pepito.getIdUnico(), pepito);
	//personas.get("123456789").getNombre());
	
	
}
