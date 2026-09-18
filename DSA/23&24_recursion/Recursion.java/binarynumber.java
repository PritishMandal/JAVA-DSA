public class binarynumber {
    public static void Binary(int n, int lastplace, String str) {
    if ( n == 0 ){
        System.out.println(str);
        return ;
    }
    Binary(n-1,0,str+"0");
    if(lastplace == 0){

        Binary(n-1,1,str+"1");
    }

        
    }
    public static void main(String[] args) {
    Binary(3,0," ");
    }
}
