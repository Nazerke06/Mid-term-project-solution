package SmartDevices;
interface SmartHomeFactory {
    Light createLight(String name);
    Thermostat createThermostat(String name);
}

class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name, "neutral"); // Default color
    }

    @Override
    public Thermostat createThermostat(String name) {
        return new Thermostat(name);
    }
}