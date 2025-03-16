package SmartDevices;

public class Thermostat implements SmartDevice {
    private String name;
    private int temperature;
    private static final int MIN_TEMP = 8;
    private static final int MAX_TEMP = 35;

    public Thermostat(String name) {
        this.name = name;
        this.temperature = 22;
    }

    public void setTemperature(int temperature) {
        if (temperature < MIN_TEMP || temperature > MAX_TEMP) {
            System.out.println("Error: Temperature must be between " + MIN_TEMP + "°C and " + MAX_TEMP + "°C.");
            return;
        }
        this.temperature = temperature;
        System.out.println(name + " set to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " is now ON at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " is now OFF");
    }
}
