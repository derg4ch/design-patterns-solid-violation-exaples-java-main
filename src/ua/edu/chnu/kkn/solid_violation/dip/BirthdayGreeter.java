package ua.edu.chnu.kkn.solid_violation.dip;

import java.time.MonthDay;
import java.util.List;

public class BirthdayGreeter
{
    private final EmployeeRepository employeeRepository;
    private final Clock clock;
    private final EmailService emailService; // залежність від інтерфейсу

    public BirthdayGreeter (EmployeeRepository employeeRepository, Clock clock, EmailService emailService)
    {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.emailService = emailService;
    }

    public void sendGreetings()
    {
        MonthDay today = clock.monthDay();
        List<Employee> employees = employeeRepository.findEmployeesBornOn(today);

        for (Employee employee : employees)
        {
            Email email = emailFor(employee);
            emailService.send(email); // використання абстракції, а не конкретний клас
        }
    }

    private Email emailFor(Employee employee)
    {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy Birthday!", message);
    }
}
