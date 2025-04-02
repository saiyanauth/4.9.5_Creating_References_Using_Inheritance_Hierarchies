class Monkey extends Primate {
  public Monkey() {
      super("plants", false, 35.0);
      System.out.println("A monkey has arrived at the zoo.");
  }

  @Override
  public void speak() {
      System.out.println("The monkey grunts.");
  }
}
