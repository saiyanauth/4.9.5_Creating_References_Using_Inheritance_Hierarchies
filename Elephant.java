class Elephant extends Animal {
    public Elephant() {
        super("plants", false, 60.0);
        System.out.println("An elephant has arrived at the zoo.");
    }

    @Override
    public void speak() {
        System.out.println("The elephant trumpets.");
    }
}
