package ua.edu.chnu.kkn.solid_violation.ocp;

public class Intern extends Employee
{
    public Intern(int salary)
    {
        super(salary);
    }

    @Override
    public int payAmount()
    {
        return (int) (salary * 0.8); // інтерн отримує 80% зарплати
    }
}
