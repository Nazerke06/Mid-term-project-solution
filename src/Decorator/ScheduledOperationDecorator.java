package Decorator;
import SmartDevices.SmartDevice;
class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private int delaySeconds;

    public ScheduledOperationDecorator(SmartDevice device, int delaySeconds) {
        super(device);
        this.delaySeconds = delaySeconds;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("   → Scheduled shutdown in " + delaySeconds + " seconds...");
        new Thread(() -> {
            try {
                Thread.sleep(delaySeconds * 1000);
                super.turnOff();
                System.out.println("   → Device automatically turned OFF after " + delaySeconds + " seconds.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
