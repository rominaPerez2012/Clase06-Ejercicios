package com.clase06_ejercicioCalculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculadoraTest {

	/*
	1. El resultado de multiplicar 80 por 3 da 240
	 */
	
	@Test
	public void dadosNumerosDecimales_cuandoSeMultiplican_elResultadoEsperadoEs() {
		
		Double numero1 = 80.0;
		Double numero2 = 3.0;
		
		Double resultadoEsperado = 240.0;
		
		// Compruebo si dos valores son iguales. Retorna true o false
		assertEquals(resultadoEsperado, Calculadora.multiplicar(numero1, numero2));
		
	}
	
	/*
	 * 2. El resultado de sumar 150 y 180, dividido por 3, da 110
	 */
	
	@Test
	public void dadosNumerosDecimales_cuandoOperanAritmeticamente_elResultadoEsperadoEs() {
		
		Double numero1 = 150.0;
		Double numero2 = 180.0;
		Double numero3 = 3.0;
		
		Double resultadoEsperado = 110.0;
		
		assertEquals(resultadoEsperado, 
				(Calculadora.dividir(Calculadora.sumar(numero1, numero2),numero3)));
	}
	
	/*
	 * 	3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
	 */
	
	@Test
	public void dadosNumerosDecimales_cuandoOperanAritmeticamente_elResultadoNoEsElEsperado() {
		
		Double numero1 = 90.0;
		Double numero2 = 50.0;
		Double numero3 = 15.0;
		
		Double resultadoNoEsperado = 605.0;
		
		Double resultadoOperacion = Calculadora.multiplicar(Calculadora.restar(numero1, numero2), numero3);
		
		//assertEquals(resultadoNoEsperado,resultadoOperacion);
		assertNotEquals(resultadoNoEsperado,resultadoOperacion);
	}
	
	//4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700
	@Test
	public void DadosNumerosDecimales_cuandoOperanAritmeticamnete_elResultadoNoDa() {
		
		Double numero1 = 70.0;
		Double numero2 = 40.0;
		Double numero3 = 25.0;
		
		Double resultadoNoEsperado = 2700.0;
		
		Double resultado = Calculadora.multiplicar(Calculadora.sumar(numero1, numero2), numero3);
		
		assertNotEquals(resultadoNoEsperado,resultado);
	}
	
}
