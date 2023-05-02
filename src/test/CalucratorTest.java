import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalucratorTest {

    @Test
    public void 引数で受け取った数値の合計を返す() {
       var expected = 30;
       var result = Calucrator.add(10, 20);
       assertEquals(expected, result);
    }
}