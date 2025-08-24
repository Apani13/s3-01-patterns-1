package level03.exercise1.invoker;

import level03.exercise1.commands.Command;
import level03.exercise1.commands.NoOpCommand;

public class RemoteControl {

    private Command startEngine;
    private Command stopEngine;
    private Command pressAccelerator;
    private Command releaseAccelerator;
    private Command pressBrakes;
    private Command releaseBrakes;

    public RemoteControl() {
        // Default to "do nothing" so we never risk a NullPointerException
        Command noOp = new NoOpCommand();
        this.startEngine = noOp;
        this.stopEngine = noOp;
        this.pressAccelerator = noOp;
        this.releaseAccelerator = noOp;
        this.pressBrakes = noOp;
        this.releaseBrakes = noOp;
    }

    // --- Setters to plug in commands ---
    public void setStartEngine(Command c)        { this.startEngine = c; }
    public void setStopEngine(Command c)         { this.stopEngine = c; }
    public void setPressAccelerator(Command c)   { this.pressAccelerator = c; }
    public void setReleaseAccelerator(Command c) { this.releaseAccelerator = c; }
    public void setPressBrakes(Command c)        { this.pressBrakes = c; }
    public void setReleaseBrakes(Command c)      { this.releaseBrakes = c; }

    // --- Button actions ---
    public void startEngine()        { startEngine.execute(); }
    public void stopEngine()         { stopEngine.execute(); }
    public void pressAccelerator()   { pressAccelerator.execute(); }
    public void releaseAccelerator() { releaseAccelerator.execute(); }
    public void pressBrakes()        { pressBrakes.execute(); }
    public void releaseBrakes()      { releaseBrakes.execute(); }
}
