package level02.exercise1.country.spain;

import level02.exercise1.core.Address;

public final class SpanishAddress implements Address {
    @Override
    public String format(String street, String number, String door, String floor, String city, String postcode, String province) {

        String line1 = street + ", " + number + (floor != null && !floor.isBlank() ? ", " + floor : "")
                + (door != null && !door.isBlank() ? " " + door : "");
        String line2 = (postcode == null ? "" : postcode + " ") + city;
        String line3 = province == null || province.isBlank() ? "" : province;
        return (line1 + "\n" + line2 + (line3.isBlank()? "" : "\n" + line3)).trim();
    }
}
