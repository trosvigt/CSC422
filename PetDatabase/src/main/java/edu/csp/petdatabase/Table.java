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
    
    // This method searches a list and displays results in a table
    public static void searchName(String search, List<Pet> pets) {
        String name;
        int age;
        int count = 0;
        
        System.out.println();
        
        printHeader();

        // Create line for matching names
        for (int i = 0; i < pets.size(); i++) {
            // Save current name and age for readability
            name = pets.get(i).getName();
            age = pets.get(i).getAge();
            
            // Compare search and current name
            if (search.equalsIgnoreCase(name)) {
                printLine(i, name, age);
                
                count++;
            }
        }
        
        printFooter(count);
        
        System.out.println();
    }
    
    // This method searches a list and displays results in a table
    public static void searchAge(String search, List<Pet> pets) {
        String name;
        int age;
        int count = 0;
        
        System.out.println();
        
        printHeader();

        // Create line for matching ages
        for (int i = 0; i < pets.size(); i++) {
            // Save current name and age for readability
            name = pets.get(i).getName();
            age = pets.get(i).getAge();
            
            // Compare search and current age
            if (Integer.parseInt(search) == age) {
                printLine(i, name, age);
                
                count++;
            }
        }
        
        printFooter(count);
        
        System.out.println();
    }
    
    // This method prints the formatted table header
    private static void printHeader() {
        System.out.println("+-------------------------+");
        System.out.printf("| %-3s | %-10s | %4s |%n",
                "ID", "NAME", "AGE");
        System.out.println("+-------------------------+");
    }
    
    // This method prints the formatted table rows
    // that make up the table body
    private static void printBody(List<Pet> pets) {
        for (int i = 0; i < pets.size(); i++) {
            System.out.printf("| %-3s | %-10s | %4d |%n"
                    , i, pets.get(i).getName()
                    ,  pets.get(i).getAge());
        }
    }
    
    // This method prints the formatted table footer
    private static void printFooter(List<Pet> pets) {
        System.out.println("+-------------------------+");
        System.out.printf("%s rows in set.\n", pets.size());
    }
    
    // This method prints the formatted table footer
    private static void printFooter(int count) {
        System.out.println("+-------------------------+");
        System.out.printf("%s rows in set.\n", count);
    }
    
    // This method prints a single table row
    private static void printLine(int id, String name, int age) {
        System.out.printf("| %-3s | %-10s | %4d |%n"
                    , id, name,  age);
    }
}