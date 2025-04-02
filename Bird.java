public class Bird extends Animal {
    public Bird(String food, boolean nocturnal, double avgLifeSpan) {
        super(food, nocturnal, avgLifeSpan);
        System.out.println("A bird arrives.");
    }
}
