package main;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private double saldo;
	private ArrayList<String> historico;
	
	public Cliente(String umNome){
		nome = umNome;
		saldo = 0;
		
		historico = new ArrayList<String>();
	}
	
	public double depositar(double valor){
		historico.add("+" + valor);
		saldo = saldo + valor;
		
		return saldo;
	}
	
	public double sacar(double valor){
		historico.add("-" + valor);
		saldo = saldo - valor;
		
		return saldo;
	}
	
	public ArrayList<String> getHistorico(){
		return historico;
	}
	
	public String toString(){
		return nome + ": " + saldo;
	}
	
}
