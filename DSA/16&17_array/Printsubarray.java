public class Printsubarray {
    public static void Printsubarray(int numbers[]) {
        int ts=0;
        for ( int  i= 0; i<numbers.length;i++) {
          int Start = i;
          for(int j=i; j<numbers.length;j++)  {
            int end=j;
            for(int k=Start;k<=end;k++){
                System.out.print(numbers[k]+" ");
            }
            ts++;
            System.out.println();
          }
          System.out.println();
        }
        System.out.println("total subarrayn="+ ts);
    }
    public static void main(String args[]) {
       int numbers[]={2,4,6,8,10};
       Printsubarray(numbers); 
    }
}
