import java.io.File;
import java.io.IOException;
public class Lab5 {
    public static void main(String[] args) {
         // Specify the file name
        String fileName = "input.txt";
        
        // Create a File object
        File file = new File(fileName);
        
        // Create a new file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        System.out.println("Exists:"+file.exists());
        if(file.exists()){
            System.out.println("absoulte path:"+file.getAbsolutePath());
            System.out.println("Name: " + file.getName());

            System.out.println("is writable:"+file.canWrite());
            System.out.println("Is readable:"+file.canRead());
            System.out.println("Is a directory:"+file.isDirectory());
            System.out.println("mkdir:"+file.mkdir());
            System.out.println("List:"+file.list());
        }
//delete
      /*   if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }*/
    }
}
