package br.edu.insper.desagil.joice.model;

public class Testador {
	public double testeNiobio(){
		CalculadoraCCC calculadoraN=new CalculadoraCCC();
		double pesoN=92.91;
		double raioN=0.143;
		double densidadeN=calculadoraN.calcula(pesoN, raioN);
		return densidadeN;
	}
	public double testeCobre(){
		CalculadoraCFC calculadoraC=new CalculadoraCFC();
		double pesoC=63.55;
		double raioC=0.128;
		double densidadeC=calculadoraC.calcula(pesoC, raioC);
		return densidadeC;

		
	}
	public double testeTungs(){
		CalculadoraCCC calculadoraT=new CalculadoraCCC();
		double pesoT=183.84;
		double raioT=0.137;
		double densidadeT=calculadoraT.calcula(pesoT, raioT);
		return densidadeT;
		
	}
	public double testeOuro(){
		CalculadoraCFC calculadoraO=new CalculadoraCFC();
		double pesoO=196.97;
		double raioO=0.144;
		double densidadeO=calculadoraO.calcula(pesoO, raioO);
		return densidadeO;
		
	}
	public double testeLitio(){
		CalculadoraCCC calculadoraL=new CalculadoraCCC();
		double pesoL=6.94;
		double raioL=0.152;
		double densidadeL=calculadoraL.calcula(pesoL, raioL);
		return densidadeL;
		
	}
	public double testePrata(){
		CalculadoraCFC calculadoraP=new CalculadoraCFC();
		double pesoP=107.87;
		double raioP=0.144;
		double densidadeP=calculadoraP.calcula(pesoP, raioP);
		return densidadeP;
		
	}
}
