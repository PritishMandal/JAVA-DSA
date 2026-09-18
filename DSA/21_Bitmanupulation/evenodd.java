public class evenodd {
    public static void oddeven(int n) {
        int bitMask=1;
        if((n & bitMask) == 0){
     System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddeven(5);
        oddeven(6);
    }
}

