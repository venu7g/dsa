package problemsolving;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(factors(4));
    }

    public static int factors(int N) {
        if (N == 0) {
            return 0;
        }
        int result = 1;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == (N / i)) {
                    result = result+ i;
                } else {
                    result = result+i + (N/i);
                }
            }
        }
        System.out.println(result);
        return result == N ? 1 : 0;
    }
}
