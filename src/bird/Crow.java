package bird;

public class Crow implements Fly, Eat, SaySomething{

    public String getColor() {
        return "Black color";
    }

    @Override
    public void eat() {
        System.out.println("Crow Eats");
    }

    @Override
    public void fly() {
         System.out.println("Crow Flies");
    }

    @Override
    public void saySomething() {
        System.out.println("Crow says caaw caww");
    }
}
