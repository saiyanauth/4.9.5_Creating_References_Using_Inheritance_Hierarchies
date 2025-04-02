class Giraffe extends Animal {
    public Giraffe() {
        super("leaves", false, 25.0);
        System.out.println("A giraffe arrives.");
    }

    @Override
    public void speak() {
        System.out.println("The giraffe hums.");
    }
}
