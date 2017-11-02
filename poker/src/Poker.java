import java.util.ArrayList;

public class Poker {
	ArrayList<Jogador> jogadores;
	private Carta mesa[] = new Carta[5];
	
	public void inserirCartaMesa(Carta carta){
		int posicao = mesa.length;
		mesa[posicao] = carta;
	}
	
	public void inserirCartaJogador(int posicao, Carta carta){
		Jogador jogador = jogadores.get(posicao);
		jogador.inserirCarta(carta);
	}
	
	public void inserirJogador(Jogador jogador){
			jogadores.add(jogador);
	}
	
	public Carta[] getMesa(){
		return mesa;
	}
}
