package br.edu.insper.desagil.joice.model;

public class MassaCFC {
	private int nAtomos;
	private double peso;
	public MassaCFC(double peso) {
		this.nAtomos=4;
		this.peso=peso;
	}
	
	public double massaTotal() {
		double avogadro=6.022*Math.pow(10, 23);
		double massa=(this.nAtomos*this.peso)/(double)avogadro;
		return massa;
	}

}
