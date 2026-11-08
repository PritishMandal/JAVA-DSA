public class sumfactorial {
    public static int calcsum(int n) { 
        if(n == 1){ //base case 
            return 1;
        }
        int Snm1 = calcsum(n -1);
        int Sn = n + Snm1 ; // x
        return Sn ;
    }
    public static void main(String[] args) {
        int n =5 ;
        System.out.print(calcsum(n));
    }
}
