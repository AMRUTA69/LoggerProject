public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      📝 LOGGER APPLICATION");
        System.out.println("========================================");

        // Create a logger instance targeting 'application.log' file
        Logger logger = new Logger("application.log");

        // Step 4: Test logger by generating several messages
        logger.log("Application started.");
        logger.log("User 'admin' logged in successfully.");
        logger.log("Fetching data from the database...");
        logger.log("Data fetched successfully. 150 records found.");
        logger.log("User logged out.");
        logger.log("Application shutting down.");

        System.out.println("\n✅ Testing complete. Please check the 'application.log' file.");
    }
}
