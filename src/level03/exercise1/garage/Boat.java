package level03.exercise1.garage;

import level03.exercise1.capabilities.EnginePowered;
import level03.exercise1.capabilities.SpeedControllable;

public class Boat implements EnginePowered, SpeedControllable {

    private final String name;
    private boolean started;
    private boolean accelerating;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public void startEngine() {
        started = true;
    }

    @Override
    public void stopEngine() {
        started = false;
        accelerating = false;
    }

    @Override
    public boolean isEngineOn() {
        return started;
    }

    @Override
    public void pressAccelerator() {
        if (started) accelerating = true;
    }

    @Override
    public void releaseAccelerator() {
        accelerating = false;
    }

    @Override
    public boolean isAccelerating() {
        return accelerating;
    }

    @Override
    public String toString() {
        return name;
    }

}
