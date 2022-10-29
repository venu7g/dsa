package problemsolving;

public class FactorsCountOfGivenNUmber {
    public static void main(String[] args) {
        System.out.println("factors(5) = " + factors(67010446483L));
    }

    public static int factors(int N) {
        if (N == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == (N / i)) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }

    public static Long factors(Long N) {
        if (N == 1) {
            return 1L;
        }
        long count = 0L;
        for (Long i = 1L; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == (N / i)) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }

}
