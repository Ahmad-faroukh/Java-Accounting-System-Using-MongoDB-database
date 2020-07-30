package Controller;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


/**
 *
 * @author ACER E15
 */


public interface Connection {
    static final String IP = "localhost";
    static final int PORT = 27017;
    static final String DB_NAME = "AccountingSystem";
    MongoClient client = new MongoClient(Connection.IP,Connection.PORT);
    MongoDatabase database = client.getDatabase(Connection.DB_NAME);
    static MongoCollection<Document> userCol = database.getCollection("user");;
    static MongoCollection<Document> adminCol = database.getCollection("admin");;
}