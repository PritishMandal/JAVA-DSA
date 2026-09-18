public class butterflypattern {
  public static void butterfly(int n) {
      for(int i=1; i<=n;i++){
        //stars-i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //Space-2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }
      //2nd half
      for(int i=n;i>=1;i--){
        
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //Space-2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars-i
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }
      }
      public static void main(String args[]) {
      butterfly(9
      );
          
      }
  }  

