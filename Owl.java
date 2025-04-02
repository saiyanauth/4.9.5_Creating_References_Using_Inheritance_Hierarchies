class Owl extends Bird {
    public Owl() {
        super("mice, insects", true, 4.0);
        System.out.println("An owl arrives.");
    }

    @Override
    public void speak() {
        System.out.println("The owl hoots.");
    }
}
