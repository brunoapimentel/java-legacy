package aula01;

import java.util.Scanner;
import aula01.Cliente;

public class main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Scanner scanner = new Scanner(System.in);
		
		cliente1.nome = scanner.nextLine();
		cliente1.saldo = Double.parseDouble(scanner.nextLine());
		
		
	}

}
