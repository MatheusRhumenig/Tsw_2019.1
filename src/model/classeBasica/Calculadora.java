package model.classeBasica;

import model.Interface.iCalculadora;

public class Calculadora implements iCalculadora {

	public int somar(String a, String b) {
		int result=0;
		result = Integer.parseInt(a) + Integer.parseInt(b);
		return result;
	}

	public Double subtrair(String a, String b) {
		double result;
		result = Double.parseDouble(a) - Double.parseDouble(b);
		return result;
	}

	public Double dividir(String a, String b) {
		Double result; 
		result = Double.parseDouble(a) / Double.parseDouble(b);
		return result;
	}
	
	public Double raizquadrada(String a) {
		Double result;
		result = Double.parseDouble(a) / Double.parseDouble(a);
		return result;
	}

	

}
