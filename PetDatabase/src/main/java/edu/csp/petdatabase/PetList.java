package edu.csp.petdatabase;

import java.util.ArrayList;

/*
This class provides methods to interact with an ArrayList
of Pet objects
*/
public class PetList {
    private ArrayList<Pet> pets;
    
    public PetList() {
        //this.pets = generateSampleData();
        this.pets = new ArrayList();
    }
    
    // This method will add a pet to the list
    public void add(Pet pet) {
        this.pets.add(pet);
    }
    
    // This method allows us to retrieve a pet by index
    public Pet get(int index) {
        return this.pets.get(index);
    }
    
    // This method allows us to retrieve the size
    public int size() {
        return this.pets.size();
    }
    
    // This method populates the array list with some
    // sample data
    private static ArrayList<Pet> generateSampleData() {
        // Initialize empty ArrayList to hold pets
        ArrayList<Pet> pets = new ArrayList<Pet>();
        
        // Create pet objects
        Pet pet1 = new Pet("Kitty", 8);
        Pet pet2 = new Pet("Bruno", 7);
        Pet pet3 = new Pet("Boomer", 8);
        Pet pet4 = new Pet("Boomer", 3);
        Pet pet5 = new Pet("Fiesty", 3);
        
        // Populate pets list
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        pets.add(pet5);
        
        return pets;
    }
}