package letscode.bd;

import org.sormula.SormulaException;
import org.sormula.Table;

public class Model {
	
	public void save() throws Exception{
		Table<Model> table = Db.getTable(Model.class);
		
		table.insert(this);
	}
	
	public static Model find(int id) throws SormulaException{
		Table<Model> table = Db.getTable(Model.class);
		
		return table.select(id);
	}
}
