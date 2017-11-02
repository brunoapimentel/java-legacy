package baralho;

import java.util.ArrayList;

public class Maco {
	public final static int NAO_ENCONTRADO = -1;
	public final static int TAMANHO = 30;
	protected ArrayList<Carta> maco = new ArrayList<>();

	public void adicionar(Carta carta) {
		maco.add(carta);
	}

	public int procurar(Carta cartaProcurada) {
		for (int i = 0; i < maco.size(); i++) {
			Carta posicaoCarta = maco.get(i);

			if (posicaoCarta.comparar(cartaProcurada)) {
				return i;
			}
		}

		return NAO_ENCONTRADO;
	}
	
	public String toString(){
		return maco.toString();
	}
	
	public Carta retirarCarta(){
		return maco.remove(maco.size()-1);
		
	}
	
	

}