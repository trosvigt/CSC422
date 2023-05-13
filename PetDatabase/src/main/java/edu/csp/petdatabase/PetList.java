package edu.csp.petdatabase;

import java.util.ArrayList;
import java.util.List;

/*
This class provides methods to interact with an ArrayList
of Pet objects
*/
public class PetList {
    private ArrayList<Pet> pets;
    
    public PetList() {
        this.pets = new ArrayList();
    }
    
    // This method will return the values
    public ArrayList<Pet> getValues() {
        return this.pets;
    }
    
    // This method will add a pet to the list
    public void add(String name, int age) {
        // Create new pet instance
        Pet pet = new Pet(this.pets.size(), name, age);
        
        // Add pet
        this.pets.add(pet);
    }
    
    // This method allows us to retrieve a pet by index
    public Pet get(int index) {
        return this.pets.get(index);
    }
    
    public ArrayList<Pet> searchName(String search) {
        ArrayList<Pet> tempPets = new ArrayList();
        for (Pet pet : this.pets) {
            if (search.equalsIgnoreCase(pet.getName())) {
                tempPets.add(pet);
            }
        }
        
        return tempPets;
    }
    
    // This method allows us to retrieve the size
    public int size() {
        return this.pets.size();
    }
}