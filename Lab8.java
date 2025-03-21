import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab8 {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name:");
            String name;
            name=reader.readLine();
            System.out.println("Your name:"+name);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
