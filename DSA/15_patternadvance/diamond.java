public class diamond {
   public static void diamondd(int n) {
       for(int i=1;i<=n;i++){
        //1st half
       for(int j=1; j<=(n-i) ;j++){
        System.out.print(" ");
       }
       //stars
       for(int j=1; j<=(2*i)-1;j++){
        System.out.print("*");
       }
       System.out.println();
   } 
   //2nd Half

for(int i=n;i>=1;i--){
    for(int j=1; j<=(n-i) ;j++){
        System.out.print(" ");
       }
       //stars
       for(int j=1; j<=(2*i)-1;j++){
        System.out.print("*");
       }
       System.out.println();
   } 

}
   
public static void main(String args[]) {
    diamondd(5);
}
}