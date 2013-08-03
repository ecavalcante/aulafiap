package br.com.fiap.loja;

// TODO: Auto-generated Javadoc
//import java.awt.image.ConvolveOp;

/**
 * The Class MoedaEstrangeira Classe responsável pelo tratamento da moeda americana.
 */
public class MoedaEstrangeira {

	/**
	 * Converter dolar: converter o valor monetário de dolar para real
	 *
	 * @param valor the valor
	 * @return: valor em real
	 * @author rm44216
	 */
	public int converterDolar (int valor){
		
		if (valor < 0){
			return 0;
		}
		return valor * 2;
	}
	/**
	 * @param args
	 */
	

}
