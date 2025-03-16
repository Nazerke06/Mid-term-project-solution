package SmartDevices;

import SmartDevices.Thermostat;
import SmartDevices.Light;
import SmartDevices.SmartDevice;

import java.util.ArrayList;
import java.util.List;


class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("🔹 Turning on all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
            if (device instanceof Light) {
                Light light = (Light) device;
                System.out.println("   → " + light.getName() + " emits " + light.getColorTemperature() + " light.");
            } else if (device instanceof Thermostat) {
                Thermostat thermostat = (Thermostat) device;
                System.out.println("   → " + thermostat.getName() + " set to " + thermostat.getTemperature() + "°C.");
            }
        }
    }

    @Override
    public void turnOff() {
        System.out.println("🔹 Turning off all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
