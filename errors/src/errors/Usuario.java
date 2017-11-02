package errors;

public class Usuario {
	private String nome;
	private String email;
	private double saldo;
	
	public Usuario(String umNome, String umEmail) throws Exception{
		nome = umNome;
		email = umEmail;
		
		if(nome.isEmpty()){
			throw new Exception("O nome está em branco");
		}
		
		saldo = 0;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String toString() {		
		return nome + " " + email + ": " + saldo;
	}
}
