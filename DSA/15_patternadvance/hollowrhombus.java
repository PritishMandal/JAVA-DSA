public class hollowrhombus {
    public static void hrhombus(int n) {
      for (int i=1;i<=n;i++ )  {
        //space
        for(int j=1; j<=(n-i);j++){
            System.out.print(" ");
        }
        //hollow rectangle-stars
        for(int j=1;j<=n;j++){
            if(i==1|| i==n||j==1||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
      
    
}
public static void main(String[] args) {
   hrhombus(9); 
}}
