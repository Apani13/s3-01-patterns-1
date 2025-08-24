package level03.exercise1;

import level03.exercise1.app.AppService;
import level03.exercise1.app.AppWorker;

public class Main {
    public static void main(String[] args) {
        AppService service = new AppService();
        AppWorker worker = new AppWorker(service);
        worker.run();
    }
}
