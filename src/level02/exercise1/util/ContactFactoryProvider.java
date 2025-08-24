package level02.exercise1.util;

import level02.exercise1.core.ContactFactory;
import level02.exercise1.country.spain.SpainFactory;
import level02.exercise1.country.us.USFactory;

public final class ContactFactoryProvider {

    private ContactFactoryProvider() {}

    public static ContactFactory forCountry(Country c) {
        return switch (c) {
            case ES -> new SpainFactory();
            case US -> new USFactory();
        };
    }
}
