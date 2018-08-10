package com.company;

import java.util.Scanner;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        String ingegevenTekst;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een tekst: ");

        ingegevenTekst =  scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("tekst.txt")))) {  // Geen true; dan wordt het vorige altijd overschreven.

            writer.println(ingegevenTekst);
        }
        System.out.println("Dit staat er in het bestand: ");

        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("tekst.txt")))) {

            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                System.out.println(line);
            }
        }
    }
}
