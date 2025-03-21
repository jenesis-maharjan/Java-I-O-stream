import java.io.*;

class Person implements Serializable {
   // private static final long serialVersionUID = 1L;
    
    public String name;
    public int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}

public class SerializeDeserializeExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Aman", 20);
        String filename="person.ser";
        // Serialize the Person object
        try{
            //saving object in a file
            OutputStream outfile=new FileOutputStream(filename); //fileoutputstream creates a file named person.ser to write the obj
            ObjectOutputStream out=new ObjectOutputStream(outfile);//objoutputstream wraps fileoutputstream to handle obj serialization process
            out.writeObject(person);
            out.close();
            outfile.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the Person object
        try {
            InputStream infile=new FileInputStream(filename);//fileinputstream opens person.ser to read the obj
            ObjectInputStream in=new ObjectInputStream(infile);//wraps to handle deserialization process
           
            //readObject() reads the byte stream from the file and converts it back into a Person object.
            Person deserializedPerson = (Person) in.readObject();
            in.close();
            infile.close();
            System.out.println("Deserialized Person...");
            System.out.println(deserializedPerson.name+","+deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
