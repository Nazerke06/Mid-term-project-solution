package SmartDevices;

class SmartHomeFacade {
    private Light livingRoomLight;
    private Thermostat thermostat;

    public SmartHomeFacade() {
        this.livingRoomLight = new Light("Living Room Light", "warm");
        this.thermostat = new Thermostat("Home Thermostat");
    }

    public void activateEveningMode() {
        System.out.println("Activating Evening Mode...");
        livingRoomLight.turnOn();
        thermostat.setTemperature(22);
    }

    public void shutdownAll() {
        System.out.println("Shutting down all devices...");
        livingRoomLight.turnOff();
        thermostat.turnOff();
    }
}