package level03.exercise1.commands;

import level03.exercise1.capabilities.EnginePowered;

public class StopEngineCommand implements Command {

    private final EnginePowered target;

    public StopEngineCommand(EnginePowered target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.stopEngine();
    }

}
