# Arrays

Brief youtube [video](https://youtu.be/iUcgZpt0Bv4) that explains array/examples.

### Exercises (answers provided in ArrayExercises.java)

*requirements are in bullets*

1. Find the **average** value for an array of {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
  * Void method: int array as a parameter, prints the average

###### answer: 5

2. Find the **sum** of **even** numbers from this array {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
  * Int[] method: int array as a parameter, returns the sum of even numbers
  * Print the sum of even numbers from the main() method

###### answer: 30

3. Sort an array of these animals: Jaguar, Orangutan, Sloth, Gorilla, Tiger
  * Animal.java consist of (String) name
  * Animal[] method: animal array as a parameter, returns the sorted list of animals
  * Print the ordered list of animal names from the main() method

###### answer: Gorilla, Jaguar, Orangutan, Sloth, Tiger

***

### Hints

Exercise 1:

  * Get the sum first then utilize .length property from arrays

Exercise 2:

  * Use modulo (%) to make it easier to see if the number is even

Exercise 3:

  * Implement Comparable for Animal.java
