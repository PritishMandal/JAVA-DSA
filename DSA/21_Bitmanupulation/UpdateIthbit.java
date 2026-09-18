public  class UpdateIthbit{
       public static int clearithbit(int n,int i) {
        int bitMask=~(1<<i);
        return n & bitMask;

    }
      public static int Setithbit(int n,int i) {
    int bitMask=1<<i;
    return n| bitMask;
      
  }  
    public static int updateIthbit(int n,int i,int newbit) {
      //  if(newbit==0){
       //     return clearithbit(n,i);
       // }else{
         //  return Setithbit(n,i);
       // }
        n=clearithbit(n,i);
        int bitMask=newbit<<i;
        return n| bitMask;
        
    }
    public static void main(String[] args) {
        System.out.print(updateIthbit(10, 2,1));
    }
}