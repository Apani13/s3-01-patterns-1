package level02.exercise1.country.spain;

import level02.exercise1.core.PhoneNumber;
public final class SpanishPhoneNumber implements PhoneNumber {
    @Override
    public String format(String countryCode, String ndc, String base) {
        String digits = (ndc == null ? "" : ndc) + (base == null ? "" : base);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length(); i++) {
            sb.append(digits.charAt(i));

            if (i == 2 || i == 4 || i == 6) sb.append(' ');
        }
        return "+" + countryCode + " " + sb.toString().trim();
    }
}
