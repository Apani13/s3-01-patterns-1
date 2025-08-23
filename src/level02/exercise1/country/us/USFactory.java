package level02.exercise1.country.us;

import level02.exercise1.core.Address;
import level02.exercise1.core.ContactFactory;
import level02.exercise1.core.PhoneNumber;

public final class USFactory implements ContactFactory {
    @Override
    public PhoneNumber createPhoneNumber() { return new USPhoneNumber(); }


    @Override
    public Address createAddress() { return new USAddress(); }
}
