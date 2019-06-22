package postal.code.validator;

import org.junit.jupiter.api.Test;

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
}