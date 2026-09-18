public class largestnumber {
   public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    int Smallest=Integer.MAX_VALUE;
    for (int i=0; i<numbers.length;i++){// ye loop array ke har element ko check karega, aur agar current element largest se bada hai to largest variable ko update karega, aur agar current element smallest se chota hai to smallest variable ko update karega.
        if(largest < numbers[i]){// agar current element largest se bada hai to largest variable ko update karega
            largest= numbers[i];
        }
        if(Smallest>numbers[i]) {
        Smallest = numbers[i] ;  

        }
    
    }
        System.out.println("Smallest value is :"+ Smallest);
    return largest;
   
   } 
   public static void main(String[] args) {
       int numbers[]={1,2,6,3,5};
        System.out.println("largest value is: "+ getLargest(numbers));
    
      
   }
}                                                                                  