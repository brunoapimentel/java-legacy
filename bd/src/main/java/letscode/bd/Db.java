package letscode.bd;

import java.sql.Connection;
import java.sql.DriverManager;

import org.sormula.Database;
import org.sormula.SormulaException;
import org.sormula.Table;

public class Db {
	public static Database database;
	
	public Db(String databaseName) throws Exception{
		Connection connection = DriverManager.getConnection("jdbc:sqlite:"+databaseName);
		database = new Database(connection);
	}
	
	public static <T> Table<T> getTable(Class<T> klazz ) throws SormulaException{
		return database.getTable(klazz);
	}
	
}
