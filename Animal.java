class Animal {
    private String food;
    private boolean nocturnal;
    private double aveLifeSpan;

    public Animal() {
        System.out.println("An animal has been created.");
    }

    public Animal(String food, boolean nocturnal, double aveLifeSpan) {
        this.food = food;
        this.nocturnal = nocturnal;
        this.aveLifeSpan = aveLifeSpan;
    }

    public void speak() {
        System.out.println("This animal makes a sound.");
    }
}
