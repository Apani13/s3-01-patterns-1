package level03.exercise1.commands;

import level03.exercise1.capabilities.Stoppable;

public class ReleaseBrakesCommand implements Command {

    private Stoppable target;

    public ReleaseBrakesCommand(Stoppable target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.releaseBrakes();
    }

}
