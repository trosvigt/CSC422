package edu.csp.petdatabase;

import java.util.ArrayList;
import java.io.*;

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
            FileWriter input = new FileWriter("pets.txt");
            for (Pet pet : pets) {
                input.write(pet.toString());
            }
            
            // Close the file
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return true;
    }
    
    // This method will read in pets from pets.txt
    public static ArrayList<Pet> load() {
        return new ArrayList();
    }
}