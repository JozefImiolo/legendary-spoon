package com.company;

import java.io.*;

public class Main {

    public static void serializePerson(Person person, String fileName) {
        if (fileName.isEmpty()) {
            fileName = "person.ser";
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

    public static Person deserializePerson(String fileName) {
        if (fileName.isEmpty()) {
            fileName = "person.ser";
        }

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Person)input.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static final String FILE_NAME = "person.ser";

    public static void main(String[] args) {
        Person p = new Person();
        p.firstname = "asd";
        p.lastname = "dsa";

        serializePerson(p, FILE_NAME);
        Person newP = deserializePerson(FILE_NAME);
        System.out.println(p.firstname);
        System.out.println(newP.firstname);


    }
}
