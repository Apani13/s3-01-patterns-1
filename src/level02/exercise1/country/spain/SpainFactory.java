package level02.exercise1.country.spain;

import level02.exercise1.core.Address;
import level02.exercise1.core.ContactFactory;
import level02.exercise1.core.PhoneNumber;


public final class SpainFactory implements ContactFactory {
    @Override
    public PhoneNumber createPhoneNumber() { return new SpanishPhoneNumber(); }


    @Override
    public Address createAddress() { return new SpanishAddress(); }
}



