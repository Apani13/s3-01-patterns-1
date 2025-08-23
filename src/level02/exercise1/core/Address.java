package level02.exercise1.core;

public interface Address {
    String format(String street, String number, String floor, String door, String city,
                      String postcode, String stateOrProvince);
}
