public class maxprefiarray {
    public static void maxprefiarray(int numbers[]) {
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int [numbers.length];
        prefix[0]=numbers[0];
        for (int i = 1; i <prefix.length; i++) {
            prefix[i]=prefix[i-1]+numbers[i];
            
        }
        for (int i = 0; i <numbers.length; i++) {
            int Start =i;
            for(int j=i; j<numbers.length;j++){
                int end = j;
                currSum=Start==0? prefix[end]:prefix[end]-prefix[Start-1];
                if(maxSum<currSum){
                    maxSum=currSum;

                }
            }
            
        } 
        System.out.println("max sum="+ maxSum);
        
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxprefiarray(numbers);
    }
}
