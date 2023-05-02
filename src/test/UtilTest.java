import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    public void 引数に受け取った値がintの範囲の数値であればtrueそうでなければfalseを返却する() {
        assertTrue(Util.isNumber("123"));
        assertFalse(Util.isNumber("1a2b3c"));
        assertFalse(Util.isNumber(""));
    }

    @Test
    public void isPostalCodetest() {
        assertTrue(Util.isPostalCode("123-4567"));
        assertTrue(Util.isPostalCode("1234567"));
        assertFalse(Util.isPostalCode("123456"));
        assertFalse(Util.isPostalCode("1234-567"));
        assertFalse(Util.isPostalCode("1234-56789"));
    }

    @Test
    public void isSmallAlphabettest() {
    // 引数として渡された文字列が小文字アルファベットだけで構成されているかどうかを判定するメソッドです
    // 正常系（assertTrue）と異常系（assertFalse）のケースが含まれています。
        assertTrue(Util.isSmallAlphabet("abc"));
        assertFalse(Util.isSmallAlphabet("a1c"));
        assertFalse(Util.isSmallAlphabet("ABC"));
        assertFalse(Util.isSmallAlphabet(""));
        assertFalse(Util.isSmallAlphabet(null));
        }

    @Test
    public void isTriangletesr() {
        assertTrue(Util.isTriangle(3, 4, 5));
        assertTrue(Util.isTriangle(5, 12, 13));
        assertFalse(Util.isTriangle(1, 1, 3));
        assertFalse(Util.isTriangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void isSquareNumbertest() {
        assertEquals(10, Util.isSquareNumber(100));
        assertEquals(12, Util.isSquareNumber(144));
        assertEquals(-1, Util.isSquareNumber(-1));
        assertEquals(-1, Util.isSquareNumber(100001));
        assertEquals(-1, Util.isSquareNumber(101));
    }
}