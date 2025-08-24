package level03.exercise1.commands;

import level03.exercise1.capabilities.SpeedControllable;

public class ReleaseAcceleratorCommand implements Command {

    private SpeedControllable target;

    public ReleaseAcceleratorCommand(SpeedControllable target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.releaseAccelerator();
    }

}
