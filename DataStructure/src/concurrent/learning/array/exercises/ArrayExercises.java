package concurrent.learning.array.exercises;

import java.util.Arrays;

public class ArrayExercises {

    public void printAverageValue(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        int avg = (float)sum / numbers.length;
        System.out.println("Solution 1: " + avg);
    }

    public int getSumOfEven(int[] numbers) {
        int sumOfEven = 0;
        for (int n : numbers) {
            if (n % 2 == 0)
                sumOfEven += n;
        }
        return sumOfEven;
    }

    public Animal[] getSortedAnimals(Animal[] animals) {
        Arrays.sort(animals);
        return animals;
    }

    public Animal[] getTropicalAnimals() {
        Animal jaguar = new Animal("Jaguar");
        Animal orangutan = new Animal("Orangutan");
        Animal sloth = new Animal("Sloth");
        Animal gorilla = new Animal("Gorilla");

        // I just wanted show an example of using an empty constructor. Typically using the other
        // constructor to actually populate the necessary attribute is preferred (the lines above).
        Animal tiger = new Animal();
        tiger.setName("Tiger");

        Animal[] tropicalAnimals = new Animal[5];
        tropicalAnimals[0] = jaguar;
        tropicalAnimals[1] = orangutan;
        tropicalAnimals[2] = sloth;
        tropicalAnimals[3] = gorilla;
        tropicalAnimals[4] = tiger;
        return tropicalAnimals;
    }

    public static void main(String[] args) {
        ArrayExercises ae = new ArrayExercises();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Problem 1
        ae.printAverageValue(numbers);

        // Problem 2
        int sumOfEven = ae.getSumOfEven(numbers);
        System.out.println("Solution 2: " + sumOfEven);

        // Problem 3
        Animal[] tropicalAnimals = ae.getTropicalAnimals();
        Animal[] sortedTropicalAnimals = ae.getSortedAnimals(tropicalAnimals);
        System.out.println("Solution 3");
        for (Animal a : sortedTropicalAnimals) {
            System.out.println(a.getName());
        }
    }

}
