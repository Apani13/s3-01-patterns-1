package level03.exercise1.app;

import level03.exercise1.commands.*;
import level03.exercise1.garage.*;
import level03.exercise1.invoker.RemoteControl;

public class AppService {

    private final Car car;
    private final Bike bike;
    private final Boat boat;
    private final Plane plane;

    public AppService() {
        this.car  = new Car("Cotxe");
        this.bike = new Bike("Bicicleta");
        this.boat = new Boat("Vaixell");
        this.plane = new Plane("Avió");
    }

    public Car getCar()   { return car; }
    public Bike getBike() { return bike; }
    public Boat getBoat() { return boat; }
    public Plane getPlane() { return plane; }

    // ---- wiring helpers ----

    public RemoteControl configureFor(Car car) {
        RemoteControl rc = new RemoteControl();
        rc.setStartEngine(new StartEngineCommand(car));
        rc.setStopEngine(new StopEngineCommand(car));
        rc.setPressAccelerator(new PressAcceleratorCommand(car));
        rc.setReleaseAccelerator(new ReleaseAcceleratorCommand(car));
        rc.setPressBrakes(new PressBrakesCommand(car));
        rc.setReleaseBrakes(new ReleaseBrakesCommand(car));
        return rc;
    }

    public RemoteControl configureFor(Bike bike) {
        RemoteControl rc = new RemoteControl();
        rc.setPressAccelerator(new PressAcceleratorCommand(bike));
        rc.setReleaseAccelerator(new ReleaseAcceleratorCommand(bike));
        rc.setPressBrakes(new PressBrakesCommand(bike));
        rc.setReleaseBrakes(new ReleaseBrakesCommand(bike));
        return rc;
    }

    public RemoteControl configureFor(Boat boat) {
        RemoteControl rc = new RemoteControl();
        rc.setStartEngine(new StartEngineCommand(boat));
        rc.setStopEngine(new StopEngineCommand(boat));
        rc.setPressAccelerator(new PressAcceleratorCommand(boat));
        rc.setReleaseAccelerator(new ReleaseAcceleratorCommand(boat));
        return rc;
    }

    public RemoteControl configureFor(Plane plane) {
        RemoteControl rc = new RemoteControl();
        rc.setStartEngine(new StartEngineCommand(plane));
        rc.setStopEngine(new StopEngineCommand(plane));
        rc.setPressAccelerator(new PressAcceleratorCommand(plane));
        rc.setReleaseAccelerator(new ReleaseAcceleratorCommand(plane));
        rc.setPressBrakes(new PressBrakesCommand(plane));
        rc.setReleaseBrakes(new ReleaseBrakesCommand(plane));
        return rc;
    }
}
