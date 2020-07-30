package Controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import Model.User;
import Model.Admin;
import com.google.gson.GsonBuilder;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER E15
 */
public class Helper {

    public static void insertUser(User user) {
        Connection.userCol.insertOne(new Document("account_id", user.getAccount_id())
                .append("name", user.getName())
                .append("password", user.getPassword())
                .append("gender", user.getGender())
                .append("phone", user.getPhone())
                .append("email", user.getEmail())
                .append("balance", user.getBalance())
        );
    }

    public static void insertAdmin(Admin admin) {
        Connection.adminCol.insertOne(new Document("name", admin.getName())
                .append("password", admin.getPassword())
        );
    }

    public static List<User> searchUsers(String operator, String key, Object value) {
        List<User> list = new ArrayList<>();
        MongoCollection<Document> collection = Connection.userCol;
        FindIterable<Document> iterator = null;;
        switch (operator) {
            case Operators.EQUAL:
                iterator = collection.find(Filters.eq(key, value));
                break;
            case Operators.GREATER_THAN:
                iterator = collection.find(Filters.gt(key, value));
                break;
            case Operators.GREATER_THAN_OR_EQUAL:
                iterator = collection.find(Filters.gte(key, value));
                break;
            case Operators.LESS_THAN:
                iterator = collection.find(Filters.lt(key, value));
                break;
            case Operators.LESS_THAN_OR_EQUAL:
                iterator = collection.find(Filters.lte(key, value));
                break;
            case Operators.NOT_EQUAL:
                iterator = collection.find(Filters.ne(key, value));
                break;
            default:
                System.out.println("Wrong Operator!!");
                return null;
        }

        for (Document doc : iterator) {
            list.add(new GsonBuilder().create().fromJson(doc.toJson(), User.class));
        }

        return list;
    }

    public static List<Admin> searchAdmins(String operator, String key, Object value) {
        List<Admin> list = new ArrayList<>();
        MongoCollection<Document> collection = Connection.adminCol;
        FindIterable<Document> iterator = null;;
        switch (operator) {
            case Operators.EQUAL:
                iterator = collection.find(Filters.eq(key, value));
                break;
            case Operators.GREATER_THAN:
                iterator = collection.find(Filters.gt(key, value));
                break;
            case Operators.GREATER_THAN_OR_EQUAL:
                iterator = collection.find(Filters.gte(key, value));
                break;
            case Operators.LESS_THAN:
                iterator = collection.find(Filters.lt(key, value));
                break;
            case Operators.LESS_THAN_OR_EQUAL:
                iterator = collection.find(Filters.lte(key, value));
                break;
            case Operators.NOT_EQUAL:
                iterator = collection.find(Filters.ne(key, value));
                break;
            default:
                System.out.println("Wrong Operator!!");
                return null;
        }

        for (Document doc : iterator) {
            list.add(new GsonBuilder().create().fromJson(doc.toJson(), Admin.class));
        }

        return list;
    }

    public static long updateUser(String operator, String searchKey, Object searchValue, String updateKey, Object updateValue) {
        MongoCollection<Document> coll = Connection.userCol;
        Document doc = new Document("$set", new Document(updateKey, updateValue));
        UpdateResult result = null;
        switch (operator) {
            case Operators.EQUAL:
                result = coll.updateMany(Filters.eq(searchKey, searchValue), doc);
                break;
            case Operators.GREATER_THAN:
                result = coll.updateMany(Filters.gt(searchKey, searchValue), doc);
                break;
            case Operators.GREATER_THAN_OR_EQUAL:
                result = coll.updateMany(Filters.gte(searchKey, searchValue), doc);
                break;
            case Operators.LESS_THAN:
                result = coll.updateMany(Filters.lt(searchKey, searchValue), doc);
                break;
            case Operators.LESS_THAN_OR_EQUAL:
                result = coll.updateMany(Filters.lte(searchKey, searchValue), doc);
                break;
            case Operators.NOT_EQUAL:
                result = coll.updateMany(Filters.ne(searchKey, searchValue), doc);
                break;
            default:
                System.out.println("Wrong Operator!!");
                return -1;
        }
        return result.getModifiedCount();
    }

    public static long deleteUser(String operator, String key, Object value) {
        MongoCollection<Document> coll = Connection.userCol;
        DeleteResult result = null;
        switch (operator) {
            case Operators.EQUAL:
                result = coll.deleteMany(Filters.eq(key, value));
                break;
            case Operators.GREATER_THAN:
                result = coll.deleteMany(Filters.gt(key, value));
                break;
            case Operators.GREATER_THAN_OR_EQUAL:
                result = coll.deleteMany(Filters.gte(key, value));
                break;
            case Operators.LESS_THAN:
                result = coll.deleteMany(Filters.lt(key, value));
                break;
            case Operators.LESS_THAN_OR_EQUAL:
                result = coll.deleteMany(Filters.lte(key, value));
                break;
            case Operators.NOT_EQUAL:
                result = coll.deleteMany(Filters.ne(key, value));
                break;
            default:
                System.out.println("Wrong Operator!!");
                return -1;
        }
        return result.getDeletedCount();
    }

    public static List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        MongoCollection<Document> collection = Connection.userCol;
        for (Document doc : collection.find()) {
            list.add(new GsonBuilder().create()
                    .fromJson(doc.toJson(), User.class));
        }
        return list;
    }

}
