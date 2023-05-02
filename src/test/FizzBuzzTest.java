import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void 引数が3で割り切れる場合がFizzと返す() {
        var expected = "Fizz";
        var nums = List.of(3, 6, 9, 12);
        nums.stream().forEach(num -> assertEquals(expected, FizzBuzz.judge(num)));
    }

    @Test
    public void 引数が5で割り切れる場合はBuzzと返す() {
        var expected = "Buzz";
        var nums = List.of(5, 10);
        nums.stream().forEach(num -> assertEquals(expected, FizzBuzz.judge(num)));
    }

    @Test
    public void 引数が3でも5でも割り切れる場合はFizzBuzzを返す() {
        var expected = "FizzBuzz";
        var nums = List.of(15, 30);
        nums.stream().forEach(num -> assertEquals(expected, FizzBuzz.judge(num)));
    }

    @Test
    public void 引数が3でも5でも割り切れない場合は引数の値をそのまま文字列で返す() {
        var ecpected = "1";
        assertEquals(ecpected, FizzBuzz.judge(1));
    }

}