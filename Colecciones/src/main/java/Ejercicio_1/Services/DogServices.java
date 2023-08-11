/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1.Services;

import Ejercicio_1.Entities.Dog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bolillo Espartano
 */
public class DogServices {

    private Dog dog;
    private List<Dog> dogList = new ArrayList();

    public Dog createDog() {
        String breed = JOptionPane.showInputDialog(null, "Enter the dog's breed");
        dog = new Dog(breed);
        dogList.add(dog);
        return dog;
    }

    public List<Dog> showListDogs() {
        dogList.forEach(dogs -> {
            System.out.println(dogs);
        });
        return dogList;
    }

    public void removeOraddDog() {
        String breed = JOptionPane.showInputDialog(null, "Enter another the dog's breed");
        dog = new Dog(breed);
        boolean dogExists = false;

        // Check if the dog with the same breed already exists in the list
        for (Dog dogs : dogList) {
            if (dogs.getBreed().equals(dog.getBreed())) {
                dogExists = true;
                break;
            }
        }

        if (dogExists) {
            // If the dog with the same breed exists, remove it from the list
            dogList.removeIf(dogs -> dogs.getBreed().equals(dog.getBreed()));
        } else {
            // If the dog with the same breed doesn't exist, add the new dog to the list
            dogList.add(dog);
        }
    }

    public void requestOption() {
        int n;
        do {
            createDog();
            n = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to enter another breed of dog?",
                    "if you select the NO option, the list of entered dog breeds will be displayed",
                    JOptionPane.YES_NO_OPTION);
        } while (n == JOptionPane.YES_OPTION);

        showListDogs();
        removeOraddDog();
        showListDogs();
    }
}
