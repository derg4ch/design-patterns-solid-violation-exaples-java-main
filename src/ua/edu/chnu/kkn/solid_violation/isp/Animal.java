package ua.edu.chnu.kkn.solid_violation.isp;

// Базовий інтерфейс
public interface Animal
{
    void run();
}

// Окремі інтерфейси для специфічних можливостей
interface Flyable
{
    void fly();
}

interface Barkable
{
    void bark();
}
