package level02.exercise1.app;

import level02.exercise1.model.AddressData;
import level02.exercise1.model.ContactEntry;
import level02.exercise1.model.PhoneData;
import level02.exercise1.util.Country;

public class AgendaWorker {
    private final AgendaService service = new AgendaService();


    public void run() {
        service.addContact(
                "Cardinelio Piristralo", Country.ES,
                new AddressData("Carrer Simea", "12", "IZQ", "3º",
                        "Barcelona", "49013", "Barcelonès"),
                new PhoneData("34", "912", "345678")
        );


        service.addContact(
                "Nihla WoodCreek", Country.US,
                new AddressData("Market St", "1355", "12B", null,
                        "San Francisco", "94103", "CA"),
                new PhoneData("1", "415", "5551234")
        );


        for (ContactEntry e : service.getAgenda().getContacts()) {
            System.out.println("=== " + e.name() + " ===");
            System.out.println(e.address());
            System.out.println(e.phone());
            System.out.println();
        }
    }
}

