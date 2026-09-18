public class Clearlastbit {
    public static int clearlastbits(int n,int i) {
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.print(clearlastbits(15, 2));
    }
}
