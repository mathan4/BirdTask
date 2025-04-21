package bird;

class Sparrow implements Fly, Eat {
    @Override
    public void fly() {
      System.out.println("Sparrow flies");
    }

    @Override
    public void eat() {
       System.out.println("Sparrow eats worms");
    }
}
