package SmartDevices;

class OldHeater {
    public void startHeating() {
        System.out.println("Old heater is now heating...");
    }
    public void stopHeating() {
        System.out.println("Old heater is now off...");
    }
}

class HeaterAdapter implements SmartDevice {
    private OldHeater oldHeater;

    public HeaterAdapter(OldHeater oldHeater) {
        this.oldHeater = oldHeater;
    }

    @Override
    public void turnOn() {
        oldHeater.startHeating();
    }

    @Override
    public void turnOff() {
        oldHeater.stopHeating();
    }
}