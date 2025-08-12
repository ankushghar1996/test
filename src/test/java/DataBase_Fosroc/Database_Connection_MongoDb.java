package DataBase_Fosroc;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.Document;

public class Database_Connection_MongoDb {
    public static void main(String[] args) {
        String connectionString = "mongodb://ReadMGDB:HsPiLOtpl@98.70.36.119:27017/?authSource=admin&directConnection=true";

        try {
            System.out.println("🔄 Trying to connect to MongoDB...");

            MongoClient mongoClient = MongoClients.create(connectionString);
            System.out.println("✅ Connected to MongoDB successfully.");

            // Check databases
            MongoIterable<String> dbs = mongoClient.listDatabaseNames();
            System.out.println("📁 Available Databases:");
            for (String dbName : dbs) {
                System.out.println(" - " + dbName);
            }

            // Optional: Try accessing a specific DB & collection
            MongoDatabase database = mongoClient.getDatabase("Fosroc_UAT");
            MongoCollection<Document> collection = database.getCollection("DistributorMaster");

            long count = collection.countDocuments();
            System.out.println("📄 Total documents in DistributorMaster: " + count);

            mongoClient.close();
            System.out.println("🔒 MongoDB connection closed.");

        } catch (Exception e) {
            System.err.println("❌ Failed to connect to MongoDB.");
            e.printStackTrace();
        }
    }
}
