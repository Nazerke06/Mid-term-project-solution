# Smart Home Control System - Documentation

## Project Overview
The **Smart Home Control System** is designed to simulate the management of various smart home devices such as lights, thermostats, and legacy devices. The system incorporates multiple **design patterns** to ensure scalability, flexibility, and ease of maintenance.

## Implemented Design Patterns

### 1. **Composite Pattern** (Organizing Devices into Groups)
- **Purpose:** Allows multiple devices (leaf nodes) and rooms (composite nodes) to be managed as a single entity.
- **Implementation:** The `Room` class acts as a composite structure that can contain multiple `SmartDevice` instances (e.g., `Light`, `Thermostat`).

### 2. **Decorator Pattern** (Extending Functionality at Runtime)
- **Purpose:** Dynamically enhances the behavior of smart devices without modifying their core implementation.
- **Implementation:**
  - `LoggingDecorator` adds logging functionality to any `SmartDevice`.
  - `PowerSavingModeDecorator` optimizes energy consumption.
  - `ScheduledOperationDecorator` schedules automatic on/off operations.

### 3. **Abstract Factory Pattern** (Creating Families of Devices)
- **Purpose:** Ensures a consistent interface for creating related devices.
- **Implementation:**
  - `SmartHomeFactory` (Interface) defines methods for creating smart devices.
  - `BasicSmartHomeFactory` creates standard `Light` and `Thermostat` objects.
  - `AdvancedSmartHomeFactory` produces smart devices with enhanced functionality.

### 4. **Facade Pattern** (Simplified Interface for Smart Home Control)
- **Purpose:** Provides a high-level API to control multiple devices without exposing internal complexities.
- **Implementation:** The `SmartHomeFacade` class provides simplified methods such as:
  - `activateEveningMode()` – Turns on lights and sets a comfortable temperature.
  - `shutdownAll()` – Turns off all smart devices.
  - `turnAllLightsOn()` – Activates all smart lights.
  - `setGlobalTemperature(int temp)` – Adjusts temperature across the system.

### 5. **Adapter Pattern** (Integrating Legacy Systems)
- **Purpose:** Allows integration of external or legacy devices that do not conform to the `SmartDevice` interface.
- **Implementation:**
  - `OldHeater` represents a legacy heater with different control methods.
  - `HeaterAdapter` adapts `OldHeater` to match the `SmartDevice` interface, allowing it to work seamlessly with the rest of the system.

## Project Structure
```
Mid-term-project-solution
│── .idea
│── src
│   ├── Decorator
│   │   ├── LoggingDecorator.java
│   │   ├── PowerSavingModeDecorator.java
│   │   ├── ScheduledOperationDecorator.java
│   │   ├── SmartDeviceDecorator.java
│   ├── SmartDevices
│   │   ├── SmartDevice.java
│   │   ├── Light.java
│   │   ├── Thermostat.java
│   │   ├── SmartDeviceFactory.java
│   │   ├── LightFactory.java
│   │   ├── ThermostatFactory.java
│   │   ├── SmartHomeFacade.java
│   │   ├── OldHeater.java
│   │   ├── HeaterAdapter.java
│   │   ├── SmartHomeFactory.java
│   │   ├── BasicSmartHomeFactory.java
│   │   ├── AdvancedSmartHomeFactory.java
│   ├── Main.java
│   │

