package model.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Interface.iCalculadora;
import model.classeBasica.Calculadora;


public class CalculadoraTest {

	public static iCalculadora cal;
	
	@BeforeClass
	public static void iniciarCal() {
		
		cal = new Calculadora();
	}
	
	@Test
	public void somar10mais2() {
		//Arranjar
		String a = "10";
		String b = "2";
		
		//Agir
		
		int resultado = cal.somar(a, b);
		
		//Afirmar
		Assert.assertEquals(12, resultado);
	}

	@Before
	public void raiz9() {
		//Arranjar
		String a = "9";
		//Agir
		Double resultado = cal.raizquadrada(a);
		//Afirmar
		Assert.assertEquals(3, resultado, 3.0);
	}
	
	@After
	public void dividir10por2() {
		//aranjar
		String a = "10";
		String b= "2";
		
		//agir
		Double resultado = cal.dividir(a, b);
		
		//afirmar
		Assert.assertEquals(5, resultado, 1.0);
	}
	
	@Test
	public void somar10mai5() {
		//Arranjar
		String a = "10";
		String b = "5";
		
		//Agir
		int resultado = cal.somar(a, b);
		
		//Afirmar
		Assert.assertEquals(15, resultado);
	}

	@Test
	public void subTest10Menos5() {
		// Arranjar
		String a = "10";
		String b = "5";
		
		// Agir
		
		Double resultado = cal.subtrair(a, b);
		
		// Afirmar
		Assert.assertEquals(5, resultado.doubleValue(), 0.00000000000001);
		
	}
	
	
	@Test
	public void subTest10Menos10() {
		// Arranjar
		String a = "10";
		String b = "10";
		
		// Agir
		Double resultado = cal.subtrair(a, b);
		
		// Afirmar
		Assert.assertEquals(0, resultado.doubleValue(), 0.00000000000001);
		
	}

}
