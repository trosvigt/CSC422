package edu.csp.petdatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class PetDatabase {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Populate sample data
        ArrayList<Pet> pets = new ArrayList();
        
        String choice = "";
        String name;
        int age;
        int count = 0;
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
                        
                        // Create Pet object
                        pet = new Pet(name, age);
                        
                        // Add to the list
                        pets.add(pet);
                        
                        // Keeps track of number of pets added
                        count++;
                    } while(!choice.equals("done"));
                    
                    // Display pet count added
                    System.out.printf("%s pet(s) added\n", count);
                    
                    // Reset count
                    count = 0;
                    
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
                    // Search pets by name
                    
                    // Prompt user and save input
                    System.out.print("Enter a name to search: ");
                    String search = input.nextLine();
                                        
                    Table.searchName(search, pets);
                    
                    break;
                }
                case "6": {
                    // Search pets by age
                    
                    // Prompt user and save input
                    System.out.print("Enter an age to search: ");
                    String search = input.nextLine();
                    
                    // Display results
                    Table.searchAge(search, pets);
                    
                    break;
                }
                case "7": {
                    System.out.println("Goodbye!");
                    
                    break;
                } default: {
                    System.out.println("Invalid input. Please try again...");
                    System.out.println();
                    
                    break;
                }
            }
        } while (!choice.equals("7"));
    }
}