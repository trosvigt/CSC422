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
                    System.out.printf("%s pet(s) added\n\n", count);
                    
                    // Reset count
                    count = 0;
                    
                    break;
                }
                case "3": {
                    // Update an existing pet
                    
                    System.out.println("You chose 3");
                    
                    break;
                    
                }
                case "4": {
                    // Remove an existing pet
                    
                    // Prompt user and save input
                    System.out.print("Enter the pet ID to remove: ");
                    choice = input.nextLine();
                    
                    // Remove pet and save return value to display
                    Pet removed = pets.remove(Integer.parseInt(choice));
                    
                    System.out.printf("%s %s has been removed\n\n"
                            , removed.getName()
                            , removed.getAge());
                    
                    break;
                }
                case "5": {
                    // Search pets by name
                    
                    // Prompt user and save input
                    System.out.print("Enter a name to search: ");
                    choice = input.nextLine();
                                        
                    Table.searchName(choice, pets);
                    
                    break;
                }
                case "6": {
                    // Search pets by age
                    
                    // Prompt user and save input
                    System.out.print("Enter an age to search: ");
                    choice = input.nextLine();
                    
                    // Display results
                    Table.searchAge(choice, pets);
                    
                    break;
                }
                case "7": {
                    System.out.println("Goodbye!");
                    
                    break;
                } default: {
                    System.out.println("Invalid input. Please try again...\n");

                    break;
                }
            }
        } while (!choice.equals("7"));
    }
}