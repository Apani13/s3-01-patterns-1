package level02.exercise1.country.us;

import level02.exercise1.core.PhoneNumber;

public final class USPhoneNumber implements PhoneNumber {
    @Override
    public String format(String countryCode, String areaCode, String subscriber) {

        String a = areaCode == null ? "" : areaCode;
        String s = subscriber == null ? "" : subscriber;
        String pretty = s;
        if (s.length() == 7) {
            pretty = s.substring(0,3) + "-" + s.substring(3);
        } else if (s.length() == 10) {
            a = s.substring(0,3);
            pretty = s.substring(3,6) + "-" + s.substring(6);
        }
        return "+" + countryCode + (a.isBlank()? " " : " (" + a + ") ") + pretty;
    }
}
