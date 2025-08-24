package level03.exercise1.garage;

import level03.exercise1.capabilities.*;

public final class Car implements EnginePowered, SpeedControllable, Stoppable {

    private final String name;
    private boolean started;
    private boolean accelerating;
    private boolean braking;

    public Car(String name) {
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
    public void pressBrakes() {
        braking = true;
    }

    @Override
    public void releaseBrakes() {
        braking = false;
    }

    @Override
    public boolean isBraking() {
        return braking;
    }

    @Override
    public String toString() {
        return name;
    }
}
