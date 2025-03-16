package SmartDevices;

class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name, "warm"); // Advanced lights default to warm
    }

    @Override
    public Thermostat createThermostat(String name) {
        Thermostat thermostat = new Thermostat(name);
        thermostat.setTemperature(20); // AI sets a smart temperature
        return thermostat;
    }
}
