public class maxkadanesum{
    public static void maxkadanesum(int numbers[]) {
        int ms=Integer.MIN_VALUE;// minimum value store karne ke liye, taki hum kisi bhi negative number ko compare kar sake, aur maximum sum ko update kar sake.
        int cs=0;
        for (int i = 0; i <numbers.length; i++) {
            cs=cs + numbers[i];
            if(cs<0){
                cs=0;
            
            }
            ms= Math.max(cs,ms);
        }
       System.out.println("Our max subarray sum is=" + ms); 
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        maxkadanesum(numbers);
    }
}