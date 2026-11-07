public class power {
    public static int powers(int x, int n) {
   if(n == 0){
    return 1;
   }     
   return x * powers(x, n-1);
    }
    public static void main(String[] args) {
        System.out.print((powers(2, 10)));
    }
    
}
