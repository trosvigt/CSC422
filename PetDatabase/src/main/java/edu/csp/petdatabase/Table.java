package edu.csp.petdatabase;

import java.util.List;

/*
This class displays a list of Pet objects in a
nicely formatted table
*/
public class Table {
    // This method will display a complete table
    public static void printTable(List<Pet> pets) {
        System.out.println();
        
        printHeader();
        
        printBody(pets);
        
        printFooter(pets);
        
        System.out.println();
    }
    
    // This method prints the formatted table header
    public static void printHeader() {
        System.out.println("+-------------------------+");
        System.out.printf("| %-3s | %-10s | %4s |%n",
                "ID", "NAME", "AGE");
        System.out.println("+-------------------------+");
    }
    
    // This method prints the formatted table rows
    // that make up the table body
    public static void printBody(List<Pet> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.printf("| %-3s | %-10s | %4d |%n"
                    , i, pets.get(i).getName()
                    ,  pets.get(i).getAge());
        }
    }
    
    // This method prints the formatted table footer
    public static void printFooter(List<Pet> pets) {
        System.out.println("+-------------------------+");
        System.out.printf("%s row(s) in set.\n", pets.size());
    }
    
    // This method prints the formatted table footer
    public static void printFooter(int count) {
        System.out.println("+-------------------------+");
        System.out.printf("%s row(s) in set.\n", count);
    }
    
    // This method prints a single table row
    public static void printLine(int id, String name, int age) {
        System.out.printf("| %-3s | %-10s | %4d |%n"
                    , id, name,  age);
    }
}