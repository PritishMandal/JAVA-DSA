public class binarynumber {

    public static void Binary(int n, int lastplace, String str) {

        // Base Case: Jab n = 0 ho jaye, toh binary string complete ho gayi
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Recursive Call 1: Har situation mein 0 add kar sakte hain
        // lastplace = 0, because the current last digit is 0
        Binary(n - 1, 0, str + "0");

        // Recursive Call 2: 1 tabhi add karenge jab previous digit 0 ho
        // Isse consecutive 1s (11) avoid honge
        if (lastplace == 0) {

            // 1 add karne ke baad lastplace = 1 ho jayega
            Binary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        // Generate binary strings of length 3
        // Initially lastplace = 0 and string is empty
        Binary(3, 0, "");
    }
}