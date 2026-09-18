
import java.util.Scanner;

public class breake {
    public static void main(String[] args) {
  //   for (int i=1; i<=5;i++) {
       //   if(i==3){
      //        break;
        //  }
       //   System.out.println(i);
     //  } 
    //   System.out.println("i am out of the loop"); 
    //  }
  Scanner sc = new Scanner(System.in); 
    do {
      System.out.println("ente the number: ");
        int n=sc.nextInt();
       if(n%10==0){//if the number is divisible by 10 then break the loop
          break;
        }
        System.out.println(n);
    } while (true);
   
  } 
   
}
