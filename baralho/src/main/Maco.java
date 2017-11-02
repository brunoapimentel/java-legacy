package main;

import java.util.ArrayList;

public class Maco {
	ArrayList<Carta> maco = new ArrayList<>();
	
	public void adicionar(Carta carta){
		maco.add(carta);
	}
	
	public int procurar(Carta cartaProcurada){
		for(int i = 0; i < maco.size(); i++){
			Carta posicaoCarta = maco.get(i);
			
			if(posicaoCarta.comparar(cartaProcurada)){
				return i;
			}
		}
		
		return -1;
	}
}
