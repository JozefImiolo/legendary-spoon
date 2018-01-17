package com.company;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {
    public static final String FNAME = "person.xml";
    public static void main(String[] args) {
        XStream xstream = new XStream(new DomDriver());
        Person p= new Person();
        p.firstname = "asd";
        p.lastname = "dsa";
        p.pesel = "3434342";


        try(PrintWriter pw = new PrintWriter(FNAME)) {
            xstream.toXML(p, pw);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Person p2 = (Person)xstream.fromXML(new FileReader(FNAME));
            System.out.println(p2.firstname);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
