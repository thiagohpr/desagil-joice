package br.edu.insper.desagil.joice.model;

public class VolumeCCC {
	private double raio;
	
	public VolumeCCC (double raio) {
		this.raio = raio*Math.pow(10, -7);
	}
	public double calculaLado() {
		return (4*this.raio)/(double)Math.sqrt(3);
	}
	
	public double volTotal() {
		double lado = calculaLado();
		return Math.pow(lado, 3);
		
	}
}
