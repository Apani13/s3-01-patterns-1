package level02.exercise1.model;

public class PhoneData {
    private final String countryCode;
    private final String areaOrNdc;
    private final String base;


    public PhoneData(String countryCode, String areaOrNdc, String base) {
        this.countryCode = countryCode; this.areaOrNdc = areaOrNdc; this.base = base;
    }


    public String getCountryCode() { return countryCode; }
    public String getAreaOrNdc() { return areaOrNdc; }
    public String getBase() { return base; }
}
