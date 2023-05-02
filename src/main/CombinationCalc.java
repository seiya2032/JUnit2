public class CombinationCalc {

    public static long calculation(int n, int r) {
        // 引数nとrが有効かどうかをチェックし、無効な場合は例外をスローします。
        if (n < r || n < 0 || r < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        // rが0の場合は、組み合わせの数は1であるため、1を返します
        if (r == 0) {
            return 1;
        }

        // 分子と分母の計算を行い、最終的にnCrを計算して返します
        // 分子は、nからn-r+1までの全ての数をかけ合わせます
        long numerator = 1;
        for (int i = n; i > n - r; i--) {
            numerator *= i;
        }

        // 分母は、1からrまでの全ての数をかけ合わせます
        long denominator = 1;
        for (int i = 1; i <= r; i++) {
            denominator *= i;
        }

        // 分子を分母で割ることで、nCrを計算します
        return (numerator / denominator);
    }
}
