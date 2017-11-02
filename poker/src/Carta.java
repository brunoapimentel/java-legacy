public class Carta {
	private String valor;
	private String naipe;
	
	
	public Carta(String umValor, String umNaipe){
		valor = umValor;
		naipe = umNaipe;
	}
	
	public String toString(){
		return valor + naipe;
	}
}