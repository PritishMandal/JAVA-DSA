public class Fibonaccinumber {
    public static int fib (int n ) {
        if( n == 0 || n ==1){ // ye line base case hai, jab n 0 ya 1 ho jaye toh hum n return kar denge
            return n;

        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n-2);
        int fn = fnm1 +fnm2 ;
        return fn;
        
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(fib(n));
    }
}
