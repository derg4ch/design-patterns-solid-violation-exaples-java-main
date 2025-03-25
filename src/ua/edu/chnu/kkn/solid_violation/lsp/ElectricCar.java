package ua.edu.chnu.kkn.solid_violation.lsp;

public class ElectricCar extends Vehicle implements ElectricPowered
{
    private static final int BATTERY_FULL = 100;
    private int batteryLevel = 0;

    @Override
    public void chargeBattery()
    {
        batteryLevel = BATTERY_FULL;
    }

    public int batteryLevel()
    {
        return batteryLevel;
    }
}