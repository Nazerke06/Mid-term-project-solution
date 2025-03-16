package Decorator;
import SmartDevices.SmartDevice;
import SmartDevices.Light;

class LoggingDecorator extends SmartDeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("[LOG] " + decoratedDevice.getClass().getSimpleName() + " is being turned ON");
        super.turnOn();
        logLightColor();
    }

    @Override
    public void turnOff() {
        System.out.println("[LOG] " + decoratedDevice.getClass().getSimpleName() + " is being turned OFF");
        super.turnOff();
    }

    private void logLightColor() {
        if (decoratedDevice instanceof Light) {
            Light light = (Light) decoratedDevice;
            System.out.println("[LOG] Light color temperature: " + light.getColorTemperature());
        }
    }
}
