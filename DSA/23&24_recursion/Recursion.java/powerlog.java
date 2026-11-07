public class powerlog{
    public static int optimizedpower(int a,int n) {
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);// ye line recursion call kar rahi hai, aur halfpower me a ka n/2 power store kar rahi hai
        int halfpowersq=halfpower*halfpower;
        if(n % 2 !=0){
            halfpowersq=a*halfpowersq;// ye line odd power ko calculate kar rahi hai
        }
        return halfpowersq;
        
    }
    public static void main(String[] args) {
        int a =2;
        int n =5;
        System.out.print(optimizedpower(a, n));
    }
}
