package postal.code.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCodeValidator {

    public static final String POSTAL_CODE_REG_EX = "[0-9]{2}-[0-9]{3}";

    public boolean isCorrect (String postalCode) {
        if (postalCode == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(POSTAL_CODE_REG_EX);
        Matcher matcher = pattern.matcher(postalCode);

        return matcher.matches();
    }
}
