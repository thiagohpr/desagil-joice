package br.edu.insper.desagil.joice.model;

public class MassaCCC {
	private int atomos;
	private double peso;
	
	public MassaCCC (double peso) {
		this.atomos = 2;
		this.peso = peso;
	}
	
	public double massaTotal() {
		double avogrado = 6.022*Math.pow(10, 23);
		double	massa = (this.atomos*this.peso)/(double)avogrado;
		return massa;
		
	}
}
