package postal.code.validator;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PostalCodeValidatorTest {


    @Test
        public void isValid(){
            PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
            assertTrue(postalCodeValidator.isCorrect("35-051"));
            assertTrue(postalCodeValidator.isCorrect("00-459"));
            assertTrue(postalCodeValidator.isCorrect("24-045"));
            assertTrue(postalCodeValidator.isCorrect("60-943"));
            assertTrue(postalCodeValidator.isCorrect("94-990"));
    }

    @Test
    public void isNotValid(){
        PostalCodeValidator postalCodeValidator = new PostalCodeValidator();
        assertFalse(postalCodeValidator.isCorrect("null"));
        assertFalse(postalCodeValidator.isCorrect(""));
        assertFalse(postalCodeValidator.isCorrect("A9-090"));
        assertFalse(postalCodeValidator.isCorrect("56=040"));
        assertFalse(postalCodeValidator.isCorrect(""));


    }
}