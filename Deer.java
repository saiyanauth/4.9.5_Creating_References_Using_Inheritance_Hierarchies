class Deer extends Hooved {
  public Deer() {
      super("plants", true, 15.0);
      System.out.println("A deer has arrived at the zoo.");
  }

  @Override
  public void speak() {
      System.out.println("The deer grunts.");
  }
}
