public class invertednumber {
    public static void invertednumbe(int n) {

        for(int i=1;i<=n; i++){
            //inner-number
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }   
        System.out.println(); 
        }
        
    }
    public static void main (String args[]){
        invertednumbe(48);
    }
}
