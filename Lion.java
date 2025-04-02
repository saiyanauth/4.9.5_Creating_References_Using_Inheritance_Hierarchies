class Lion extends Feline {
    public Lion() {
        super("meat", true, 20.0);
        System.out.println("A lion has arrived at the zoo.");
    }

    @Override
    public void speak() {
        System.out.println("The lion roars.");
    }
}
