package level02.exercise1.country.us;

import level02.exercise1.core.Address;

public final class USAddress implements Address {
    @Override
    public String format(String street, String number, String apt, String floor, String city, String zip, String state) {

        String line1 = number + " " + street + (apt == null || apt.isBlank()? "" : ", Apt " + apt)
                + (floor == null || floor.isBlank()? "" : ", Floor " + floor);
        String line2 = city + ", " + (state == null? "" : state) + " " + (zip == null? "" : zip);
        return (line1 + "\n" + line2).trim();
    }
}
