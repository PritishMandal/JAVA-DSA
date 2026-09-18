public class que2Power {
    public static boolean ispowertwo(int n) {
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        System.out.print(ispowertwo(8));
    }
}
