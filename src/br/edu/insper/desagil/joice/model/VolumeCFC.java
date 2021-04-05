package br.edu.insper.desagil.joice.model;

public class VolumeCFC {
	private double raio;
	
	public VolumeCFC(double raio) {
		this.raio=raio;
	}
	
	public void converteRaio() {
		this.raio=this.raio*Math.pow(10, -7);
	}
	
	public double calculaLado() {
		converteRaio();
		return (4*this.raio)/(double)Math.pow(2, 0.5);
	}
	public double volTotal() {
		double lado=calculaLado();
		return Math.pow(lado, 3);
	}

}
