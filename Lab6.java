import java.io.*;

public class Lab6 {
    public static void main(String[] args) {
        // Source and destination file names
        String sourceFileName = "BcaRead.txt";
        String destinationFileName = "Bcawrite.txt";

        // File objects for source and destination files
        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);

        // Check if the source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // BufferedReader to read from the source file
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile)); //file reader obj created to read from sourcefile and wrappedin Buffered Reader
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            // Read each line from the source file and write to the destination file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            e.printStackTrace();
        }
    }
}
