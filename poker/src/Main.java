
public class Main {

	public static void main(String[] args) {
		Maco maco = new Maco();
		
		while(! maco.estaVazio() ){
			System.out.println(maco.sortear());
		}
	}
}
