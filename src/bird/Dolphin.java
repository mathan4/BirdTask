package bird;

public class Dolphin implements Eat, SaySomething{
    @Override
    public void eat() {
        System.out.println("Dolphin eats small fish");
    }

    @Override
    public void saySomething() {
        System.out.println("Dolphin says something");
    }
}
