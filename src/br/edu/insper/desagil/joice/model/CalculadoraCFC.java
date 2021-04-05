package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{

	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}

	@Override
	public double calcula(double peso, double raio) {
		MassaCFC m = new MassaCFC(peso);
		VolumeCFC v = new VolumeCFC(raio);
		
		double densidade=m.massaTotal()/(double)v.volTotal();
		return densidade;
	}

}
