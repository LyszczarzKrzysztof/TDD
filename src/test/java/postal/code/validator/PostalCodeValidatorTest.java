package postal.code.validator;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PostalCodeValidatorTest {


    @Test
    public void isValid() {
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertTrue(postalCodeValidator.isCorrect("00-000"));
        assertTrue(postalCodeValidator.isCorrect("99-999"));
        assertTrue(postalCodeValidator.isCorrect("24-045"));
        assertTrue(postalCodeValidator.isCorrect("11-111"));
        assertTrue(postalCodeValidator.isCorrect("94-990"));
    }

    @Test
    public void isNotValid() {
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertFalse(postalCodeValidator.isCorrect("null"));
        assertFalse(postalCodeValidator.isCorrect(""));
        assertFalse(postalCodeValidator.isCorrect("A9-090"));
        assertFalse(postalCodeValidator.isCorrect("56+b10"));
        assertFalse(postalCodeValidator.isCorrect("#+7*9"));
        //assertFalse(postalCodeValidator.isCorrect(null));
    }


    // zwijamy powyzsze wstawki "na sztywno" za pomoca anotacji parametryzowanej w jedna:

    @ParameterizedTest
    @ValueSource(strings = {"00-000", "99-999","35-021","25-202"})
    public void valid(String postalCode){
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertTrue(postalCodeValidator.isCorrect(postalCode));
    }

    @ParameterizedTest
    @ValueSource(strings = {"00-0a1", "9b-999","&*=*-/","null",""})
    public void inValid(String postalCode){
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertFalse(postalCodeValidator.isCorrect(postalCode));
    }

    @ParameterizedTest
    @NullAndEmptySource             // przekaze nulla i wartosci puste
    public void inValidNullAndEmpty(String postalCode){
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertFalse(postalCodeValidator.isCorrect(postalCode));
    }

    @ParameterizedTest
    @NullSource                     // przekaze tylko nulla
    public void inValidNull(String postalCode){
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertFalse(postalCodeValidator.isCorrect(postalCode));
    }
}