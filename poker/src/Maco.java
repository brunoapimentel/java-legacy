import java.util.ArrayList;
import java.util.Random;

public class Maco {
	public String[] valoresDisponiveis = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	public String[] naipesDisponiveis = { "P", "C", "E", "O" };

	ArrayList<Carta> maco = new ArrayList<>();

	public Maco() {

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				String umValor = valoresDisponiveis[i];
				String umNaipe = naipesDisponiveis[j];
				Carta carta = new Carta(umValor, umNaipe);
				maco.add(carta);
			}
		}

	}

	public Carta sortear() {
		Random gerador = new Random();
		int random = gerador.nextInt(maco.size() - 1);
		return maco.remove(random);
	}

	public boolean estaVazio() {
		return maco.size() == 0;
	}
}
