//file writer

import java.io.FileWriter;
import java.io.Writer;

public class Lab4 {
        public static void main(String[] args) {
            String data="AMAN is handsome!!!!!! ";
            try{
                Writer output=new FileWriter("AMAN.txt"); //casting
            
                //writes data to the output stream
                output.write(data);
                System.out.println("Data is written.");
                output.close();
            }catch(Exception e){
                e.getStackTrace();
            }
        }
    }

