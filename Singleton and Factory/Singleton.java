class Database {
    private static Database dbObject;
    private Database() {   }
    public static Database getInstance() {
        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }
        // returns the singleton object
        System.out.println("address: " + dbObject);
        return dbObject;
    }
    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

public class Singleton {
    public static void main(String[] args) {
        Database db1;

        // refers to the only object of Database
        db1= Database.getInstance();

        db1.getConnection();

        Database db2 = Database.getInstance();
    }
}
