package edu.csp.petdatabase;

import java.util.Scanner;

public class PetDatabase {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Populate sample data
        Pet[] pets = generateSampleData();
        
        String choice = "";
        
        // Main loop that will run until the user selects 7
        do {
            // Display menu items
            Menu.printMenu();

            // Grab choice from the user
            choice = input.nextLine();
            
            switch(choice) {
                case "1": {
                    Table.printTable(pets);
                    break;
                }
                case "2": {
                    System.out.println("You chose 2");
                    break;
                }
                case "3": {
                    System.out.println("You chose 3");
                    break;
                }
                case "4": {
                    System.out.println("You chose 4");
                    break;
                }
                case "5": {
                    System.out.println("You chose 5");
                    break;
                }
                case "6": {
                    System.out.println("You chose 6");
                    break;
                }
                case "7": {
                    System.out.println("Goodbye!");
                    break;
                } default: {
                    System.out.println("Invalid input. Please try again...");
                    break;
                }
            }
        } while (!choice.equals("7"));
    }
    
    public static Pet[] generateSampleData() {
        // Initialize empty array to hold pets
        Pet[] pets = new Pet[5];
        
        // Create pet objects
        Pet pet1 = new Pet("Kitty", 8);
        Pet pet2 = new Pet("Bruno", 7);
        Pet pet3 = new Pet("Boomer", 8);
        Pet pet4 = new Pet("Boomer", 3);
        Pet pet5 = new Pet("Fiesty", 3);
        
        // Populate pets array
        pets[0] = pet1;
        pets[1] = pet2;
        pets[2] = pet3;
        pets[3] = pet4;
        pets[4] = pet5;
        
        return pets;
    }
}