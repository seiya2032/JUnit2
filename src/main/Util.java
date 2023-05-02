public class Util {
    public static boolean isNumber(String str) {
        // 文字列が数値に変換できるかどうかを判定するために、try-catchブロックを使用する必要があります。
        try {
        // 整数に変換して変換が成功すれば「true」を返す
            int num = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
        //そうでなければ「false」を返す
            return false;
        }
    }

    // 引数で与えられた文字列が日本の郵便番号の形式に合致するかどうかを検証する
    public static boolean isPostalCode(String str) {
    // 正規表現パターンの ^\\d{3}-?\\d{4}$|^\\d{7}$ は、上記の条件を満たす文字列にマッチします。
        String pattern = "^\\d{3}-?\\d{4}$|^\\d{7}$";
    // 文字列がパターンに一致する場合は true を、一致しない場合は false を返します。
        return str.matches(pattern);
    }

    public static boolean isSmallAlphabet(String str) {
    // 引数 str が null または空文字列である場合は false を返す
        if (str == null || str.isEmpty()) {
            return false;
        }
    // 正規表現 "^[a-z]+$" を用いて、str が小文字のアルファベットのみから構成されているかどうかを判定します。
        return str.matches("^[a-z]+$");
    }

    public static boolean isTriangle(int a, int b, int c) {
    // 下記の条件が成り立つ場合は三角形が成立し、成り立たない場合は三角形は成立しないと判定します。
        return a+b > c && a+c > b && b+c > a;
    }

    public static int isSquareNumber(int num) {
        if (num < 0 || num > 100000) {
            return -1;
        }
        int root = (int) Math.sqrt(num);
        if (root * root == num) {
            return root;
        } else {
            return -1;
        }
    }
}
