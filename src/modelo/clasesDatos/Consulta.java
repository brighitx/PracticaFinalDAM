package modelo.clasesDatos;

import java.io.Serializable;

public class Consulta implements Serializable{
	private String idConsulta;
	private boolean[][] libre = new boolean[8][5];
	
	
	public Consulta(String idConsulta, boolean[][] libre) {
		super();
		this.setIdConsulta(idConsulta);
		this.setLibre(libre);
	}
	public String getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}
	public boolean[][] getLibre() {
		return libre;
	}
	public void setLibre(boolean[][] libre) {
		this.libre = libre;
	}
	public void cambiarTurnoMaņanaEntero()
	{
		for (int i = 0; i < this.getLibre().length-4; i++) {
			for (int j = 0; j < this.getLibre()[i].length; j++) {
				this.getLibre()[i][j]=false;
			}
		}
	}
	public boolean ComprobarTurnoMaņanaEntero()
	{
		boolean retorno=true;
		for (int i = 0; i < this.getLibre().length-4; i++) {
			for (int j = 0; j < this.getLibre()[i].length; j++) {
				if(!this.getLibre()[i][j]) retorno=false;
			}
		}
		return retorno;
	}
	
	public void cambiarTurnoMaņanaParcial(boolean[] dias, int numero)
	{
		int inicio=numero-10;
		for (int i = inicio; i < 2; i++) {
			for (int j = 0; j < this.getLibre()[i].length; j++) {
				if(dias[i]) this.getLibre()[i][j]=false;
			}
		}
	}
	public boolean comprobarTurnoMaņanaParcial(boolean[] dias, int numero)
	{
		boolean retorno=true;
		int inicio=numero-10;
		System.out.println(dias.length);
		System.out.println(inicio);
		System.out.println(this.getLibre()[0].length);
		for (int i = inicio; i < 2; i++) {
			for (int j = 0; j < this.getLibre()[i].length; j++) {
				if(dias[i] && !this.getLibre()[i][j]) {
					retorno=false;
				}
			}
		}
		return retorno;
	}
	public boolean comprobarTurnoTardeParcial(boolean[] dias, int numero)
	{
		boolean retorno=true;
		int inicio=numero-12;
		for (int i = 0; i < this.getLibre().length; i++) {
			for (int j = inicio; j < 2; j++) {
				if(dias[i]) retorno=false;
			}
		}
		return retorno;
	}
	public void cambiarTurnoTardeParcial(boolean[] dias, int numero)
	{
		int inicio=numero-12;
		for (int i = 0; i < this.getLibre().length; i++) {
			for (int j = inicio; j < 2; j++) {
				if(dias[i]) this.getLibre()[i][j]=false;
			}
		}
	}
	public void cambiarTurnoTardeEntero()
	{
		for (int i = 4; i < this.getLibre().length; i++) {
			for (int j = 0; j < this.getLibre()[i].length; j++) {
				this.getLibre()[i][j]=false;
			}
		}
	}
	public boolean ComprobarTurnoTardeEntero()
	{
		boolean retorno=true;
		for (int i = 4; i < this.getLibre().length; i++) {
			for (int j = 0; j < this.getLibre()[i].length; j++) {
				if(!this.getLibre()[i][j]) retorno=false;
			}
		}
		return retorno;
	}
	
}
