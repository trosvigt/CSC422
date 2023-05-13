package edu.csp.petdatabase;

import java.util.Scanner;

public class PetDatabase {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Populate sample data
        PetList pets = new PetList();
        
        String choice = "";
        String name;
        int age;
        Pet pet;
        
        // Main loop that will run until the user selects 7
        do {
            // Display menu items
            Menu.printMenu();

            // Grab choice from the user
            choice = input.nextLine();
            
            switch(choice) {
                case "1": {
                    // View all pets
                    Table.printTable(pets);
                    
                    break;
                }
                case "2": {
                    do {
                        // Add more pets
                        
                        System.out.print("add pet (name, age): ");
                        
                        // Get user choice
                        choice = input.nextLine();
                        
                        // Skip iteration
                        if (choice.equals("done")) {
                            continue;
                        }
                        
                        // Extract values
                        String[] values = choice.split(" ");
                        name = values[0];
                        age = Integer.parseInt(values[1]);
                        
                        // Create new Pet instance and add to list
                        pet = new Pet(name, age);
                        pets.add(pet);
                    } while(!choice.equals("done"));
                    
                    System.out.println();
                    
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
}