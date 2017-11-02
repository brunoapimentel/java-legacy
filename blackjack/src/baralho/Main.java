package baralho;

public class Main {
	public static void main(String[] args) {
		MyScanner.teste();
		MyScanner scanner = new MyScanner();
		MacoBlackJack maco = new MacoBlackJack();
		int menu = 0;
		Carta cartaEscolhida;
		
		int pontuacao = 0;
		
		while (menu != 2) {
			System.out.println("Digite uma opção");
			System.out.println("1- Jogar");
			System.out.println("2- Sair");

			menu = scanner.nextInt();

			if (menu == 1) {
				cartaEscolhida = maco.retirarCarta();
				System.out.println(cartaEscolhida);
				pontuacao = pontuacao + cartaEscolhida.getPontuacao();
				System.out.println("Sua pontuação é: " + pontuacao);

				if (pontuacao > 21) {
					System.out.println("Você perdeu!");
					menu = 2;
				}
			}

		}
	}

}
