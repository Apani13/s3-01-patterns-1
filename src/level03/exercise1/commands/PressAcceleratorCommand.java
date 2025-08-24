package level03.exercise1.commands;

import level03.exercise1.capabilities.SpeedControllable;

public class PressAcceleratorCommand implements Command {

    private SpeedControllable target;

    public PressAcceleratorCommand(SpeedControllable target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.pressAccelerator();
    }

}
