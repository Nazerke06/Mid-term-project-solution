package SmartDevices;

interface SmartDeviceFactory {
    SmartDevice createDevice(String name);
}

class LightFactory implements SmartDeviceFactory {
    @Override
    public SmartDevice createDevice(String name) {
        return new Light(name, "neutral"); // Default to neutral color
    }
}

class ThermostatFactory implements SmartDeviceFactory {
    @Override
    public SmartDevice createDevice(String name) {
        return new Thermostat(name);
    }
}