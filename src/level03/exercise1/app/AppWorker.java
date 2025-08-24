package level03.exercise1.app;

import level03.exercise1.garage.*;
import level03.exercise1.invoker.RemoteControl;

public class AppWorker {

    private final AppService service;

    public AppWorker(AppService service) {
        this.service = service;
    }

    public void run() {
        demoCar();
        demoBike();
        demoBoat();
        demoPlane();
    }

    private void demoCar() {
        Car car = service.getCar();
        RemoteControl rc = service.configureFor(car);

        System.out.println("\n=== " + car + " ===");
        System.out.println("Arrencant motor...");
        rc.startEngine();

        System.out.println("Accelerant...");
        rc.pressAccelerator();

        System.out.println("Frenant...");
        rc.pressBrakes();

        System.out.println("Alliberant accelerador...");
        rc.releaseAccelerator();

        System.out.println("Alliberant fre...");
        rc.releaseBrakes();

        System.out.println("Aturant motor...");
        rc.stopEngine();
    }

    private void demoBike() {
        Bike bike = service.getBike();
        RemoteControl rc = service.configureFor(bike);

        System.out.println("\n=== " + bike + " ===");
        System.out.println("Accelerant...");
        rc.pressAccelerator();

        System.out.println("Frenant...");
        rc.pressBrakes();

        System.out.println("Alliberant accelerador...");
        rc.releaseAccelerator();

        System.out.println("Alliberant fre...");
        rc.releaseBrakes();
    }

    private void demoBoat() {
        Boat boat = service.getBoat();
        RemoteControl rc = service.configureFor(boat);

        System.out.println("\n=== " + boat + " ===");
        System.out.println("Arrencant motor...");
        rc.startEngine();

        System.out.println("Accelerant...");
        rc.pressAccelerator();

        System.out.println("Frenant...");
        rc.pressBrakes();

        System.out.println("Alliberant accelerador...");
        rc.releaseAccelerator();

        System.out.println("Alliberant fre...");
        rc.releaseBrakes();

        System.out.println("Aturant motor...");
        rc.stopEngine();
    }

    private void demoPlane() {
        Plane plane = service.getPlane();
        RemoteControl rc = service.configureFor(plane);

        System.out.println("\n=== " + plane + " ===");
        System.out.println("Arrencant motor...");
        rc.startEngine();

        System.out.println("Accelerant...");
        rc.pressAccelerator();

        System.out.println("Frenant...");
        rc.pressBrakes();

        System.out.println("Alliberant accelerador...");
        rc.releaseAccelerator();

        System.out.println("Alliberant fre...");
        rc.releaseBrakes();

        System.out.println("Aturant motor...");
        rc.stopEngine();
    }
}
