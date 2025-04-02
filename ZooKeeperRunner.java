import java.util.ArrayList;

public class ZooKeeperRunner {
    public static void main(String[] args) {
        // Create an ArrayList of Animals
        ArrayList<Animal> zoo = new ArrayList<>();

        // Adding animals that have sounds
        zoo.add(new Elephant());
        zoo.add(new Tiger());
        zoo.add(new Gorilla());
        zoo.add(new Giraffe());
        zoo.add(new Owl());
        zoo.add(new Penguin());

        // Iterate through the zoo and call speak method polymorphically
        for (Animal animal : zoo) {
            animal.speak();
        }

        // Calling hearTheAnimal method
        hearTheAnimal(new Tiger());
        hearTheAnimal(new Elephant());
        hearTheAnimal(new Owl());
    }

    // Method to call an animal's speak method
    public static void hearTheAnimal(Animal currentAnimal) {
        currentAnimal.speak();
    }
}
