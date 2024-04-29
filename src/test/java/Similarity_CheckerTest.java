import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Similarity_CheckerTest {
    @Test
    void lengthTest() {
        assertEquals(60, new Similarity_Checker("ASD", "DSA").getlengthScore());
        assertEquals(0, new Similarity_Checker("A", "BB").getlengthScore());
        assertEquals(20, new Similarity_Checker("AAABB", "BAA").getlengthScore());
        assertEquals(30, new Similarity_Checker("AA", "AAE").getlengthScore());
    }
}