package br.com.fiap.loja;

import java.util.Scanner;

public class LojaFreeShop {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		
		System.out.println("Digite o valor em Dolar");
		Scanner teclado = new Scanner(System.in);
		int iValorDolar = teclado.nextInt();
		
		int iValor =converter.converterDolar(iValorDolar);
		
		System.out.println("Valor em Real:" + iValor);
		teclado.close();
	}

}
