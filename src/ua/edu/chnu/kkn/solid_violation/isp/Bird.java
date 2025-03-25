package ua.edu.chnu.kkn.solid_violation.isp;

public class Bird implements Animal, Flyable
{
    @Override
    public void run()
    {
        System.out.print("Bird is running");
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}
