package Decorator;
import SmartDevices.SmartDevice;

abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public SmartDeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }
}
