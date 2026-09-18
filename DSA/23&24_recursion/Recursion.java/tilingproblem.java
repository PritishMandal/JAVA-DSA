public class tilingproblem {
    public static int TilingProblem(int n) 
    {
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = TilingProblem(n-1);
        int fnm2 = TilingProblem(n-2);
        int totways = fnm1 + fnm1;
        return totways;
    }
    public static void main(String[] args) {
        System.out.print(TilingProblem(3));
    }
}
