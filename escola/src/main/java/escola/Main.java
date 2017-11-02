package escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.sormula.Database;
import org.sormula.Table;

public class Main {
	public static void main(String[] args) throws Exception{
		Connection connection = DriverManager.getConnection("jdbc:sqlite:escola.db");
		
		Database database = new Database(connection);
		Table<Usuario> tabelaUsuario = database.getTable(Usuario.class);
		
//		Usuario usuario = new Usuario();
//		
//		usuario.setNome("Maria");
//		usuario.setCpf("666.666.666-66");
//		usuario.setTipo(1);
//		
//		tabelaUsuario.insert(usuario);
		
		List<Usuario> listaUsuarios = tabelaUsuario.selectAll(); 
		
		for(Usuario usuario: listaUsuarios){
			System.out.println(usuario.getId());
			System.out.println(usuario.getNome());
		}
		
//		tabelaUsuario.delete(2);
	}
}
