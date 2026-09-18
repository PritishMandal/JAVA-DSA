public class subarrayminhw {
    public static void subarraymin(int numbers []) {
        int ts=0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length;i++){
           int Start =i;
           int sum=0;
           for(int j=i;j<numbers.length;j++) {
            int end=j;
            for(int k=Start;k<=end;k++){
                System.out.print(numbers[k]+" ");
            
                sum+=numbers[k];
        }
            //update min and max sum
            if(sum>maxSum){
                maxSum = sum ;
            }
            if(sum < minSum){
                minSum =sum;
            }

                ts++;
             System.out.println( "sum :"+sum);
           }
           System.out.println();
        }
        System.out.println("the total subarray of subarrays : "+ ts);
         System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8};
    subarraymin(numbers);
}}
