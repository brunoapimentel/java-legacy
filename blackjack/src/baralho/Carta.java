package baralho;

import java.util.Random;

public class Carta {
	private String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private String[] naipes = { "P", "C", "E", "O" };

	private String valor;
	private String naipe;

	public Carta(String input) {
		String umNaipe;
		String umValor;

		if (input.length() == 3) {
			umValor = input.substring(0, 2);
			umNaipe = input.substring(2, 3);
		} else {
			umValor = input.substring(0, 1);
			umNaipe = input.substring(1, 2);
		}

		valor = umValor;
		naipe = umNaipe;
	}

	public boolean eValida() {
		return validarNaipe(naipe) && validarValor(valor);
	}

	private boolean validarValor(String valor) {
		for (int i = 0; i < valores.length; i++) {
			if (valor.equals(valores[i])) {
				return true;
			}
		}

		return false;
	}

	private boolean validarNaipe(String naipe) {
		for (int i = 0; i < naipes.length; i++) {
			if (naipe.equals(naipes[i])) {
				return true;
			}
		}

		return false;
	}

	public boolean comparar(Carta umaCarta) {
		return umaCarta.valor.equals(valor) && umaCarta.naipe.equals(naipe);
	}

	public Carta() {
		Random gerador = new Random();

		int valorSorteado = gerador.nextInt(12);
		int naipeSorteado = gerador.nextInt(3);

		valor = valores[valorSorteado];
		naipe = naipes[naipeSorteado];

	}
	
	public String toString(){
		return valor + naipe;
		
	}
	
	public int getPontuacao(){
		for (int i=0;i<valores.length;i++){
			if(valor==valores[i]){
				return i+1;
			}
		}
		return 0;
	}
	

}