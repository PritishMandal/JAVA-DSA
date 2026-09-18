public class Palindrom {
    public static boolean palindrom(String str) {
        for (int i = 0; i <str.length()/2 ; i++) {// ye loop string ke first half tak chalega
            int n=str.length();// string ke length ko n me store kar liya kyuki hume last character ko access karna hai
            if(str.charAt(i)!=str.charAt(n-1-i)){// its not a palindrom    

             
            return false; 
        }}
       return true; 
    } 
    
    public static void main(String[] args) {
        String str="noon";
        System.out.println(palindrom(str));
    }

}

