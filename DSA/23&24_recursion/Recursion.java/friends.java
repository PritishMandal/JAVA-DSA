public class friends {
    public static int friend(int n) {
        if( n ==1 || n == 2){// base case hai, jab n 1 ya 2 ho jaye toh hum n return kar denge
            return n;
        }
        int fnm1 = friend(n - 1);
        int fnm2 = friend( n- 2);
        int pairways = (n -1) * fnm2;// ye line pair ways ko calculate kar rahi hai
        int totways = fnm1 + pairways;
        return totways;
        
    }
    public static void main(String[] args) {
        System.out.print(friend(3));
    }
}
