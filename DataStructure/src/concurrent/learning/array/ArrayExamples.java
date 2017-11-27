package concurrent.learning.array;

import java.util.Arrays;

public class ArrayExamples {

    public void printNumbers() {
        int[] wholeNumbers = {2, 3, 4, 10, 5};
        Arrays.sort(wholeNumbers);
        for (int n : wholeNumbers) {
            System.out.println(n);
        }
    }

    public void printPeople() {
        Person justin = new Person("Justin", 23, true);
        Person bob = new Person("Bob", 45, false);
        Person sung = new Person("Sung", 23, false);

        Person[] people = new Person[3];
        people[0] = justin;
        people[1] = bob;
        people[2] = sung;

        for (int i = 0; i < people.length; i++) {
            System.out.println("Name is " + people[i].name + ". Age is "
                    + people[i].age + ". IsSingle = " + people[i].isSingle);
        }
    }

    public static void main(String[] args) {
        ArrayExamples ae = new ArrayExamples();
        //ae.printNumbers();
        ae.printPeople();
    }

}
