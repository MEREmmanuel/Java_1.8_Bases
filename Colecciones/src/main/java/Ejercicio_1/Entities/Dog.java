/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1.Entities;

/**
 *
 * @author bolillo Espartano
 */
public class Dog {
    private String Breed;
    
    /**
     * Default constructor
     */
    public Dog() {
    }
    
    /**
     * Constructor with dog breed
     * @param Breed 
     */
    public Dog(String Breed) {
        this.Breed = Breed;
    }
    
    /**
     * Return Breed
     * @return
     */
    public String getBreed() {
        return Breed;
    }

    /**
     * Set Breed
     * @param Breed 
     */
    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "Breed=" + Breed + '}';
    }
    
    
}
