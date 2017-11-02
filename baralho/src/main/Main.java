package main;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args){
		MyScanner scanner = new MyScanner(); 
		Maco maco = new Maco();
		int menu = 0;
		Carta cartaEscolhida;
		
		Random gerador = new Random();
		int umNumero = gerador.nextInt(13);
		
		System.out.println(umNumero);
		
		
		maco.adicionar(new Carta("3C"));
		maco.adicionar(new Carta("AP"));
		maco.adicionar(new Carta("10O"));
		maco.adicionar(new Carta("KP"));
		maco.adicionar(new Carta("AE"));
		
		while(menu != 2){
			System.out.println("Digite uma opção");
			System.out.println("1- Jogar");
			System.out.println("2- Sair");
			
			menu = scanner.nextInt();
			
			if(menu == 1){
				System.out.println("Digite a carta desejada:");
				
				cartaEscolhida = new Carta(scanner.nextLine());
				
				if(cartaEscolhida.eValida()){
					int indice = maco.procurar(cartaEscolhida);
					
					if(indice > -1){
						System.out.println("A carta foi encontrada na posicao " + indice);
					}else{
						System.out.println("A carta não foi encontrada");
					}
				}else{
					System.out.println("Carta inválida");
				}
				
			}
		}
		
	}
}
