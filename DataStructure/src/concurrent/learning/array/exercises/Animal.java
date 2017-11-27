package concurrent.learning.array.exercises;

public class Animal implements Comparable<Animal> {

    private String name;

    public Animal() {
        // empty constructor
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
