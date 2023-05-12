package edu.csp.petdatabase;

public class Menu {
    public static void printMenu() {
        System.out.println("What would you like to do?");
        
        System.out.println("1) View all pets");
        System.out.println("2) Add more pets");
        System.out.println("3) Update an existing pet");
        System.out.println("4) Remove an existing pet");
        System.out.println("5) Search pets by name");
        System.out.println("6) Search pets by age");
        System.out.println("7) Exit program");
        
        System.out.print("Your choice: ");
    }
}