import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationCalcTest {

    @Test
    public void  calculationtest() {
        assertEquals(1, CombinationCalc.calculation(5, 0));
        assertEquals(1, CombinationCalc.calculation(5, 5));
        assertEquals(10, CombinationCalc.calculation(5, 2));
        assertEquals(120, CombinationCalc.calculation(10, 3));
        assertThrows(IllegalArgumentException.class, () -> CombinationCalc.calculation(5, 6));
        assertThrows(IllegalArgumentException.class, () -> CombinationCalc.calculation(-1, 5));
    }
}