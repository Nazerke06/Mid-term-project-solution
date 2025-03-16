package Decorator;
import SmartDevices.SmartDevice;
import SmartDevices.Light;
import SmartDevices.Thermostat;

class PowerSavingModeDecorator extends SmartDeviceDecorator {
    public PowerSavingModeDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        if (decoratedDevice instanceof Light) {
            System.out.println("   → Power-saving mode: reducing brightness.");
        } else if (decoratedDevice instanceof Thermostat) {
            Thermostat t = (Thermostat) decoratedDevice;
            int newTemp = Math.max(16, t.getTemperature() - 2);
            t.setTemperature(newTemp);
            System.out.println("   → Power-saving mode: temperature reduced to " + newTemp + "°C.");
        }
    }
}
