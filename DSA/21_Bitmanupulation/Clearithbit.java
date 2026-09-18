public class Clearithbit {
    public static int clearithbit(int n,int i) {
        int bitMask=~(1<<i);
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.print(clearithbit(10, 1));
    }
}
