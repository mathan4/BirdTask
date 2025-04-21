package bird;

public class Eagle implements Eat, Fly, SaySomething{
    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Flies High");

    }

    @Override
    public void saySomething() {
        System.out.println("Eagle says something");
    }
}
