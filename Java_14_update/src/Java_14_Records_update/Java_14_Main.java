package Java_14_Records_update;

import java.io.*;

public class Java_14_Main {
    public static void main(String[] args) {
        var nikhil=new Update_Person("Nikhil",12);
        var nithin =new Update_Person("Nithin",32);
        Update_Person WriteAndRead = new Update_Person("Nidhish",24);
      //  var nithin =new Update_Person(null,-32);
        //static method getting static variable value
        System.out.println(Update_Person.getInstanceCtr());
        //toString
        System.out.println(nikhil);
        //equals()
        System.out.println(nikhil.equals(nithin));
        //hashCode()
        System.out.println(nikhil.hashCode());
        System.out.println(nithin.hashCode());
        //getting value
        System.out.println(nikhil.name());
        System.out.println(nikhil.age());


        //for checking  constructor put null and negative age value in nithin
        System.out.println(nithin);

        //reading and writing to a file
      writeToFile(WriteAndRead.toString(),"Java14_records1");
        System.out.println(readFromFile("Java14_records1"));
    }

    private static Update_Person readFromFile(String path) {
        Update_Person result=null;
        try(ObjectInputStream ois =new ObjectInputStream(new FileInputStream(path))){
           result=(Update_Person) ois.readObject();
           ois.close();
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        return result;
    }

    private static void writeToFile(String obj, String path) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(obj);
            oos.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
