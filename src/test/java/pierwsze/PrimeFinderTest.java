package pierwsze;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {
    @ParameterizedTest
    @ValueSource(ints = {1,5,10,15,2460})
    public void ileLiczb(int liczba){
        assertEquals(liczba, PrimeFinder.finder(liczba).size());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,0})
    public void nieMaLiczb(int liczba){
        assertNull(PrimeFinder.finder(liczba));
    }
}