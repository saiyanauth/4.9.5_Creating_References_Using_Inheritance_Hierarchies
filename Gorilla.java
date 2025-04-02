class Gorilla extends Primate {
    public Gorilla() {
        super("plants", false, 35.0);
        System.out.println("A gorilla has arrived at the zoo.");
    }

    @Override
    public void speak() {
        System.out.println("The gorilla grunts.");
    }
}
