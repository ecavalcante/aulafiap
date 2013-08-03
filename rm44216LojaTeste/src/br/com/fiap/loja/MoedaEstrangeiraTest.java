package br.com.fiap.loja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstrangeiraTest {

	@Test
	public void testConverterDolarValorPositivo() {
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int iValor =converter.converterDolar(5);
		assertEquals("Calcular valor com 5 dolares",10, iValor);
		
	}
	
	@Test
	public void testConverterDolarValorZero() {
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int iValor =converter.converterDolar(0);
		assertEquals("Calcular valor para valores zerados",0, iValor);
		
	}
	
	@Test
	public void testConverterDolarValorNegativo() {
		MoedaEstrangeira converter = new MoedaEstrangeira();
		int iValor =converter.converterDolar(-1);
		assertEquals("Calcular valor para valores zerados",0, iValor);
		
	}

}
