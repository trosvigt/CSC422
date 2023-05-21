package edu.csp.petdatabase;

import java.util.Scanner;

public class PetDatabase {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // Get pets
        Database pets = new Database();
        
        String choice = "";
        String menuChoice = "";
        String name;
        int age;
        int count = 0;
        Pet pet;
        Pet replaced;
        int index;
        
        // Display program title
        System.out.println("Pet Database Program\n");
        
        // Main loop that will run until the user selects 7
        do {
            // Display menu items
            Menu.printMenu();

            // Grab choice from the user
            menuChoice = input.nextLine();
            
            switch(menuChoice) {
                case "1": {
                    // View all pets
                    
                    pets.display();
                    
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
                        
                        String[] values = choice.split(" ");
                        
                        // Ensure user only provides two values
                        if (values.length != 2) {
                            System.out.println(
                                String.format("Error: %s is not a valid input",
                                    choice)
                            );
                            
                            continue;
                        }
                        
                        // Extract values
                        name = values[0];
                        age = Integer.parseInt(values[1]);
                        
                        // Create Pet object
                        pet = new Pet(name, age);
                        
                        // Add to the list
                        if (!pets.add(pet)) {
                            break;
                        }
                        
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
                    
                    // Prompt user and save input
                    System.out.print("Enter the pet ID you wish to update: ");
                    index = Integer.parseInt(input.nextLine());
                    
                    System.out.print("Enter new name and new age: ");
                    choice = input.nextLine();
                    
                    // Extract values
                    String[] values = choice.split(" ");
                    name = values[0];
                    age = Integer.parseInt(values[1]);
                    
                    // Create new pet
                    pet = new Pet(name, age);
                    
                    // Replace existing pet
                    replaced = pets.set(index, pet);
                    
                    System.out.printf("%s %s changed to %s %s\n\n"
                            , replaced.getName()
                            , replaced.getAge()
                            , pet.getName()
                            , pet.getAge());
                    
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
                                        
                    pets.searchName(choice);
                    
                    break;
                }
                case "6": {
                    // Search pets by age
                    
                    // Prompt user and save input
                    System.out.print("Enter an age to search: ");
                    choice = input.nextLine();
                    
                    // Display results
                    pets.searchAge(choice);
                    
                    break;
                }
                case "7": {                    
                    // Save pets
                    pets.save();
                    
                    System.out.println("Goodbye!");
                    
                    break;
                } default: {
                    System.out.println("Invalid input. Please try again...\n");

                    break;
                }
            }
        } while (!menuChoice.equals("7"));
        
        input.close();
    }
}