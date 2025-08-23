package level02.exercise1.app;

import level02.exercise1.core.Address;
import level02.exercise1.core.ContactFactory;
import level02.exercise1.core.PhoneNumber;
import level02.exercise1.model.AddressData;
import level02.exercise1.model.Agenda;
import level02.exercise1.model.ContactEntry;
import level02.exercise1.model.PhoneData;
import level02.exercise1.util.ContactFactoryProvider;
import level02.exercise1.util.Country;

public class AgendaService {
    private final Agenda agenda;


    public AgendaService() {
        this.agenda = new Agenda();
    }


    public void addContact(String name, Country country, AddressData address, PhoneData phone) {
        ContactFactory factory = ContactFactoryProvider.forCountry(country);
        Address addr = factory.createAddress();
        PhoneNumber ph = factory.createPhoneNumber();


        String formattedAddress = addr.format(
                address.getStreet(), address.getNumber(), address.getDoor(), address.getFloor(),
                address.getCity(), address.getPostcode(), address.getStateOrProvince()
        );


        String formattedPhone = ph.format(
                phone.getCountryCode(), phone.getAreaOrNdc(), phone.getBase()
        );


        agenda.add(new ContactEntry(name, formattedAddress, formattedPhone));
    }


    public Agenda getAgenda() { return agenda; }
}
