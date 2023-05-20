package edu.csp.petdatabase;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/*
This class saves and loads pets to/from pets.txt
*/
public class Database {
    // This method will save pets to pets.txt
    public static boolean save(ArrayList<Pet> pets) {
        try {
            // Create file if it does not already exist
            File file = new File("pets.txt");
            
            // Loop through and write pets to the file
            FileWriter output = new FileWriter("pets.txt");
            for (Pet pet : pets) {
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
    public static ArrayList<Pet> load() {
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
}