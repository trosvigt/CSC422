package edu.csp.petdatabase;

public class Pet {
    private int id;
    private String name;
    private int age;
    
    public Pet(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    
    // *******
    // Getters
    // *******
    public int getId() {
        return this.id;
    }
    
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
}
