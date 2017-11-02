package baralho;

public class MacoBlackJack extends Maco {
	public static final int TAMANHO = 50;
	
	public MacoBlackJack() {
		for (int i = 0; i < TAMANHO; i++){
			maco.add(new Carta());
		}
	}
}
