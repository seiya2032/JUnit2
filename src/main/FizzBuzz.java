public class FizzBuzz {
    public static String judge(Integer num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}
// リファクタリング
// 下記のif文は　if (num % 15 == 0) としても同じ結果になります
// if (num % 3 == 0 && num % 5 == 0)
// 他には、以下のように文字列を結合していく実装方法なども考えられます。

// public static String judge(int num) {
//    var result = "";
//    if (num % 3 == 0) {
//        result += "Fizz";
//    }
//    if(num % 5 == 0) {
//        result += "Buzz";
//    }
//    if(result.isEmpty()) {
//        result = String.valueOf(num);
//    }
//    return result;
//}