package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	public CalculadoraCCC() {
		super ("Cúbica de Corpo Centrado");
		
		
	}
	@Override
	public double calcula(double peso, double raio) {
		MassaCCC m = new MassaCCC(peso);
		VolumeCCC v = new VolumeCCC(raio);
		double massa = m.massaTotal();
		double volume = v.volTotal();
		return massa/(double)volume;
	}
}