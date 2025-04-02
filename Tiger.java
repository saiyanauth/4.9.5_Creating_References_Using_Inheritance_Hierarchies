class Tiger extends Feline {
    public Tiger() {
        super("meat", true, 15.0);
        System.out.println("A tiger has arrived at the zoo.");
    }

    @Override
    public void speak() {
        System.out.println("The tiger roars.");
    }
}
