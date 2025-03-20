//write content on file using output stream

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Lab2 {
    public static void main(String[] args) {
        String data="He is handsome!!!!!! ";
        try{
            OutputStream out=new FileOutputStream("input.txt");
            //converts the string into  bytes
            byte[] dataBytes = data.getBytes();
            //writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written.");
            out.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
