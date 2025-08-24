package level03.exercise1.commands;

import level03.exercise1.capabilities.Stoppable;

public class PressBrakesCommand implements Command {

    private Stoppable target;

    public PressBrakesCommand(Stoppable target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.pressBrakes();
    }

}
