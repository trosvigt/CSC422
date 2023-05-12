package edu.csp.petdatabase;

public class PetDatabase {
    public static void main(String[] args) {
        Pet[] pets = generateSampleData();
        
        Table.printTable(pets);
    }
    
    public static Pet[] generateSampleData() {
        // Initialize empty array to hold pets
        Pet[] pets = new Pet[5];
        
        // Create pet objects
        Pet pet1 = new Pet("Kitty", 8);
        Pet pet2 = new Pet("Bruno", 7);
        Pet pet3 = new Pet("Boomer", 8);
        Pet pet4 = new Pet("Boomer", 3);
        Pet pet5 = new Pet("Fiesty", 3);
        
        // Populate pets array
        pets[0] = pet1;
        pets[1] = pet2;
        pets[2] = pet3;
        pets[3] = pet4;
        pets[4] = pet5;
        
        return pets;
    }
}