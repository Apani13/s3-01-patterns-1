package level03.exercise1.garage;

import level03.exercise1.capabilities.SpeedControllable;
import level03.exercise1.capabilities.Stoppable;

public class Bike implements SpeedControllable, Stoppable {

    private final String name;
    private boolean pedaling;
    private boolean braking;

    public Bike(String name) {
        this.name = name;
    }

    @Override
    public void pressAccelerator() {
        pedaling = true;
    }

    @Override
    public void releaseAccelerator() {
        pedaling = false;
    }

    @Override
    public boolean isAccelerating() {
        return pedaling;
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
