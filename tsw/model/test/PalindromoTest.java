package model.test;

import org.junit.Assert;
import org.junit.Test;

import model.Interface.iPalindromo;
import model.classeBasica.Palindromo;

public class PalindromoTest {

	public static iPalindromo palin;
	
	//Java é Case-Sensitive, obviamente os teste vão falhar se a houver letra maiusculas e menusculas e acentos. 
	
	//Negativo: Com hifén no meio da frase
	@Test
	public void exPalidromoAnaNegativo() {
		
		//Arranjar
		boolean result;
		String txt = "An-a";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Positivo
	@Test
	public void exPalidromoAnaPositivo() {
		
		//Arranjar
		boolean result;
		String txt = "Ana";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	
	//Negativo: Com 1 caracter
	@Test
	public void exPalidromoAraraNegativo() {
		
		//Arranjar
		boolean result;
		String txt = "A";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Positivo
	@Test
	public void exPalidromoAraraPositivo() {
		
		//Arranjar
		boolean result;
		String txt = "Arara";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Exceção: Sem caracter
	@Test
	public void exPalidromoAmeoPoemaNegativo() {
		
		//Arranjar
		boolean result;
		String txt = "";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Positivo
	@Test
	public void exPalidromoAmeoPoemaPositivo() {
		
		//Arranjar
		boolean result;
		String txt = "Ame o Poema";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	
	//Negativo: Com acento. Não consegui usar o Normalize.
	@Test
	public void exPalidromoAPósaSopaNegativo() {
		
		//Arranjar
		boolean result;
		String txt = "Após a Sopa";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Positivo
	@Test
	public void exPalidromoAPósaSopaPositivo() {
		
		//Arranjar
		boolean result;
		String txt = "Após a Sopa";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Positivo
	@Test
	public void exPalidromoASacadaDaCasaNegativo() {
		
		//Arranjar
		boolean result;
		String txt = "A SaCada Da Casa";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//outro Positivo: ignora letras maiusculas
	@Test
	public void exPalidromoASacadaDaCasaPositivo() {
		
		//Arranjar
		boolean result;
		String txt = "A Sacada da Casa";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
	
	//Positivo
	@Test
	public void exPalidromoLuzAzulNegativo() {
		
		//Arranjar
		boolean result;
		String txt = "Luz Azul";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}	

	//Outro Positivo: ignora espaços no meio da variavel
	@Test
	public void exPalidromoLuzAzulPositivo() {
		
		//Arranjar
		boolean result;
		String txt = " Lu z Az u l";
		
		//Agir
		palin = new Palindromo();
		result=palin.isPalindromo(txt);
		
		//Afirmar
		Assert.assertEquals(true, result);
	}
}
