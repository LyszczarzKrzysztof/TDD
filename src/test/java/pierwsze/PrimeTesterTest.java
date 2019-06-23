package pierwsze;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTesterTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,17389})
    public void liczbaPierwsza(int liczba){
        assertTrue(PrimeTester.isPrime(liczba));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,0,1,4,10,1200657,1000222002})
    public void liczbaNiePierwsza(int liczba){
        assertFalse(PrimeTester.isPrime(liczba));
    }

}