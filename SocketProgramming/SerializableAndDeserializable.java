package com.abidhasan.SimplehttpServer.SimpleChatApplication;

import java.io.*;
public class SerializableAndDeserializable {
    public static void main(String[] args) {
        //create instance of the class
        Person person =  new Person("John Doe", 30, "New York");
       // Serializable the object to a file
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))){
            outputStream.writeObject(person);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //Deserilaize the object from a file
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))){
            Person loadedperson = (Person) inputStream.readObject();
        System.out.println(loadedperson);}
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
//Define a serializable class
class Person implements  Serializable{
    private String name;
    private int age;
    private  String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    //shpw the output like this
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
    }
}
//    We create a Person class that implements the Serializable interface. This class represents the object we want to serialize.
//
//        We create an instance of the Person class and serialize it to a file using ObjectOutputStream.
//
//        We then deserialize the object from the file using ObjectInputStream.
//
//        Finally, we print the loaded Person object to verify that it has been successfully deserialized.
//
//        Make sure to handle exceptions properly and close the streams in a real application to ensure resource management and error handling.