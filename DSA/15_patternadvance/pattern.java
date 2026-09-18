public class pattern{
public static void hollow_rectangle(int totRows,int totcols){
    //outer loop
    for (int i=1; i<= totRows ; i++)  {                          
  
    //inrer column
    for (int j =1; j<=totcols;j++) {
        //cell-(i,j)
        if(i == 1|| i == totRows|| j== 1|| j == totcols) {
            //boundary cells
            System.out.print("*");
        }
        else{
            System.out.print( " ");
        }

        }
    System.out.println();
 }}
    public static void main(String args []) {
        hollow_rectangle(8,9);
    }
    
}

