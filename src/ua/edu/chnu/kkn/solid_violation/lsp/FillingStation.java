package ua.edu.chnu.kkn.solid_violation.lsp;

public class FillingStation
{
    public void refuel(FuelPowered vehicle)
    {
        vehicle.fillUpWithFuel();
    }

    public void charge(ElectricPowered vehicle)
    {
        vehicle.chargeBattery();
    }
}
