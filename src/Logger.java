import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private String fileName;
    // Format: 2026-10-17 14:30:15
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    // ---------- Step 1 & 2 & 3: Log method with append mode & try-with-resources ----------
    public void log(String message) {
        if (message == null || message.trim().isEmpty()) {
            System.out.println("❌ Error: Log message cannot be empty.");
            return;
        }

        // Get current date and time
        String timestamp = LocalDateTime.now().format(formatter);
        
        // Format the log entry
        String logEntry = "[" + timestamp + "] " + message;

        // Step 2: FileWriter in append mode (true) using try-with-resources
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(logEntry + System.lineSeparator());
            System.out.println("✔ Logged: " + logEntry);
        } catch (IOException e) {
            System.out.println("❌ Error writing to log file: " + e.getMessage());
        }
    }
}