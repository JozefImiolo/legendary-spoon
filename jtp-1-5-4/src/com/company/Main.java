package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static final String F1_NAME = "f1.csv";
    public static final String F2_NAME = "f2.csv";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(F1_NAME));

        Integer row1;
        String row2;
        Integer row3;
        Double row4;
        Double sum = 0.0;
        String newFile = "";

        while (scanner.hasNextLine()) {
            Scanner elementsScanner = new Scanner(scanner.next());
            elementsScanner.useDelimiter(",");

            row1 = elementsScanner.nextInt();
            row2 = elementsScanner.next();
            row3 = elementsScanner.nextInt();
            row4 = Double.parseDouble(elementsScanner.next());

            sum += row4;
            newFile += row1 + " " + row4 + "\n";
        }

        try(FileWriter fw = new FileWriter(F2_NAME)) {
            fw.write(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sum);

    }
}
