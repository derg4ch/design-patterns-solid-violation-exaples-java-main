package ua.edu.chnu.kkn.solid_violation.ocp;

public class Manager extends Employee
{
    private int bonus;

    public Manager(int salary, int bonus)
    {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public int payAmount()
    {
        return salary + bonus;
    }
}
