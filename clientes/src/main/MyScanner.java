package main;

import java.util.Scanner;

public class MyScanner {
	public Scanner scanner;
	
	public MyScanner(){
		scanner = new Scanner(System.in);
	}
	
	public double nextDouble(){
		String valor = scanner.nextLine();
		
		return Double.parseDouble(valor);
	}
	
	public int nextInt(){
		String valor = scanner.nextLine();
		
		return Integer.parseInt(valor);
	}
	
	public String nextLine(){
		return scanner.nextLine();
	}
	
}
