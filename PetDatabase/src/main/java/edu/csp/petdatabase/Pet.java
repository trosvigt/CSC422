package edu.csp.petdatabase;

/*
This class models a Pet
*/
public class Pet {
    private String name;
    private int age;
    
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    // *******
    // Getters
    // *******
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    
    // *******
    // Setters
    // *******
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("%s,%s\n", this.name, this.age);
    }
}
