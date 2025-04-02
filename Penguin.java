class Penguin extends Bird {
    public Penguin() {
        super("fish", false, 20.0);
        System.out.println("A penguin arrives.");
    }

    @Override
    public void speak() {
        System.out.println("The penguin squawks.");
    }
}
