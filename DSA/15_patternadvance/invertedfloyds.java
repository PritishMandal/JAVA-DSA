public class invertedfloyds {
    public static void invertedfloydstriangle(int n){
        //outer
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //inner-how many times will counter be printed
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println( );
        }
    }

public static void main(String args[]){
    invertedfloydstriangle(9);
}}
