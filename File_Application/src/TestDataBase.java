import model.Database;

public class TestDataBase {



public static void main(String[] args) {
	
	Database db = new Database();
	
	try {
		db.connect();
	}catch(Exception e) {
		e.printStackTrace();
	}
}



}