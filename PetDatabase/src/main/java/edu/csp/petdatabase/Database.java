package edu.csp.petdatabase;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/*
This class provides basic database functionality
for the Pets Database program
*/
public class Database {
    private ArrayList<Pet> pets = new ArrayList();
    
    public Database() {
        this.pets = Database.load();
    }
    
    // This method will save pets to pets.txt
    public boolean save() {
        try {
            // Create file if it does not already exist
            File file = new File("pets.txt");
            file.createNewFile();
            
            // Loop through and write pets to the file
            FileWriter output = new FileWriter("pets.txt");
            for (Pet pet : this.pets) {
                output.write(pet.toString());
            }
            
            // Close the file
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }
    
    // This method will read in pets from pets.txt
    private static ArrayList<Pet> load() {
        ArrayList<Pet> pets = new ArrayList();
        Pet pet;
        String name;
        int age;
        
        try {
            // Grab file and check if it exists
            File file = new File("pets.txt");
            
            // If file does not exist, return empty list
            if (!file.exists()) {
                return pets;
            }

            Scanner input = new Scanner(file);
            
            // Read line by line
            while (input.hasNextLine()) {
                String line = input.nextLine();
              
                // Split on comma
                String[] parts = line.split(",");

                // Save data
                name = parts[0];
                age = Integer.parseInt(parts[1]);

                // Create pet
                pet = new Pet(name, age);

                // Add to list
                pets.add(pet);
            }
            
            // Close file
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return pets;
    }
    
    // This method will display pets
    public void display() {
        Table.printTable(pets);
    }
    
    // This method will add pets to the database
    public boolean add(Pet pet) {
        String message;
        
        // Do not allow more than five pets to be added
        if (this.pets.size() >= 5) {
            System.out.println("Error: Database is full\n");

            // Exit loop
           return false;
        }
        
        // Age must be between 1 and 20
        if (pet.getAge() < 1 || pet.getAge() > 20) {
            // Create and display error message
            message = String.format("Error: %s is not a valid age"); 
            System.out.println(message);
        }
        
        // Add the pet
        this.pets.add(pet);
        
        return true;
    }
    
    // This method will let you replace a Pet
    public Pet set(int index, Pet pet) {
        // Do not allow index out of range
        if (index >= this.pets.size()) {
            System.out.println(
                String.format("Error: ID %s does not exist\n",
                    index)
            );
            
            return null;
        }
        
        // Set pet and save old
        Pet replaced = this.pets.set(index, pet);
        
        return replaced;
    }
    
    // This method will remove a Pet from the database
    public Pet remove(int index) {
        // Do not allow index out of range
            if (index >= this.pets.size()) {
                System.out.println(
                    String.format("Error: ID %s does not exist\n",
                        index)
                );
                
                return null;
            }

            Pet removed = this.pets.remove(index);
        
        return removed;
    }
    
    // This method searches a List and displays results in a table
    public void searchName(String search) {
        String name;
        int age;
        int count = 0;
        
        System.out.println();
        
        Table.printHeader();

        // Create line for matching names
        for (int i = 0; i < this.pets.size(); i++) {
            // Save current name and age for readability
            name = this.pets.get(i).getName();
            age = this.pets.get(i).getAge();
            
            // Compare search and current name
            if (search.equalsIgnoreCase(name)) {
                Table.printLine(i, name, age);
                
                count++;
            }
        }
        
        Table.printFooter(count);
        
        System.out.println();
    }
    
    // This method searches a list and displays results in a table
    public void searchAge(String search) {
        String name;
        int age;
        int count = 0;
        
        System.out.println();
        
        Table.printHeader();

        // Create line for matching ages
        for (int i = 0; i < this.pets.size(); i++) {
            // Save current name and age for readability
            name = this.pets.get(i).getName();
            age = this.pets.get(i).getAge();
            
            // Compare search and current age
            if (Integer.parseInt(search) == age) {
                Table.printLine(i, name, age);
                
                count++;
            }
        }
        
        Table.printFooter(count);
        
        System.out.println();
    }
}