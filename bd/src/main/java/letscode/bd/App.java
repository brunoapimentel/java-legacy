package letscode.bd;

import org.sormula.Table;

public class App {
	public static void main(String[] args) throws Exception {
		new Db("db.sqlite");
		
		User user = (User) User.find(1);
		
		System.out.println(user.name);
	}
}
