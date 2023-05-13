package edu.csp.petdatabase;

import java.util.ArrayList;

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
        // Create a copy so user can't modify original
        ArrayList<Pet> copy = (ArrayList)this.pets.clone();
        
        return copy;
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
    
    // This method will return a list of results matching name
    public ArrayList<Pet> searchName(String search) {
        // Create temp list for results
        ArrayList<Pet> tempPets = new ArrayList();
        
        // Loop over pets and save matching names
        for (Pet pet : this.pets) {
            if (search.equalsIgnoreCase(pet.getName())) {
                tempPets.add(pet);
            }
        }
        
        return tempPets;
    }
    
    // This method will return a list of results matching age
    public ArrayList<Pet> searchAge(String search) {
        // Convert age to int
        int age = Integer.parseInt(search);
        
        // Create temp list for results
        ArrayList<Pet> tempPets = new ArrayList();
        
        // Loop over pets and save matching ages
        for (Pet pet : this.pets) {
            if (age == pet.getAge()) {
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