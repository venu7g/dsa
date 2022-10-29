package problemsolving;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 49;
        for(int i=2;i<num;i++){
            boolean isPrime = primeOrNot(i) == 2;
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    public static int primeOrNot(int n){
        if(n==0){
            return 0;
        }
        int sum = 0;
        for (int i =1; i * i <= n;i++){
            if(n%i==0){
                if(i==n/i){
                  sum = sum+1  ;
                }else {
                    sum = sum+2;
                }
            }
        }
        return sum;
    }
}
