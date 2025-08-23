package level02.exercise1.model;

public class AddressData {
    private final String street;
    private final String number;
    private final String door;
    private final String floor;
    private final String city;
    private final String postcode;
    private final String stateOrProvince;


    public AddressData(String street, String number, String door, String floor,
                       String city, String postcode, String stateOrProvince) {
        this.street = street; this.number = number; this.door = door; this.floor = floor;
        this.city = city; this.postcode = postcode; this.stateOrProvince = stateOrProvince;
    }


    public String getStreet() { return street; }
    public String getNumber() { return number; }
    public String getDoor() { return door; }
    public String getFloor() { return floor; }
    public String getCity() { return city; }
    public String getPostcode() { return postcode; }
    public String getStateOrProvince() { return stateOrProvince; }
}
