public class Setithbit {
  public static int Setithbit(int n,int i) {
    int bitMask=1<<i;
    return n| bitMask;
      
  }  
  public static void main(String[] args) {
      System.out.print(Setithbit(10, 2));
  }
}
