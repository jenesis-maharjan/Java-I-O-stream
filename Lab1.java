//read file using InputStream and print hte content of file in console

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Lab1{
    public static void main(String[] args) {
        byte[] array =new byte[20];
        try{
            InputStream input=new FileInputStream("input.txt");
            System.out.println("available bytes inthe file:"+input.available());
            //read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file:\n");
            //convert byte into atring
            String data = new String (array);
            System.out.println(data);
            //close input strream
            input.close();
        }catch(IOException e){
            e.printStackTrace();
        }
  
    }
}