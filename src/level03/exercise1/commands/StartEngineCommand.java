package level03.exercise1.commands;

import level03.exercise1.capabilities.EnginePowered;

public class StartEngineCommand implements Command {

    private final EnginePowered target;

    public StartEngineCommand(EnginePowered target) {
        this.target = target;
    }

    @Override
    public void execute() {
        target.startEngine();
    }
}
