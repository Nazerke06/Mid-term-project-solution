package SmartDevices;

import java.util.Arrays;
import java.util.List;

public class Light implements SmartDevice {
    private String name;
    private String colorTemperature;
    private static final List<String> VALID_COLORS = Arrays.asList("warm", "cool", "neutral");
    public Light(String name, String colorTemperature) {
        if (!isValidColor(colorTemperature)) {
            throw new IllegalArgumentException("Invalid color: " + colorTemperature);
        }
        this.name = name;
        this.colorTemperature = colorTemperature;
    }
    public void setColorTemperature(String colorTemperature) {
        if (!isValidColor(colorTemperature)) {
            System.out.println("Error: Invalid color choice. Available options: warm, cool, neutral.");
            return;
        }
        this.colorTemperature = colorTemperature;
        System.out.println(name + " color changed to " + colorTemperature);
    }

    public String getName() {
        return name;
    }

    public String getColorTemperature() {
        return colorTemperature;
    }

    private boolean isValidColor(String color) {
        return VALID_COLORS.contains(color);
    }
    @Override
    public void turnOn() {
        System.out.println(name + " is now ON with " + colorTemperature + " light");
    }
    @Override
    public void turnOff() {
        System.out.println(name + " is now OFF");
    }
}
