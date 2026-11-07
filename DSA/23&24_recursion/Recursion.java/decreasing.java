public class decreasing {

    public static void printdec(int n) {

        // Base Case: Jab n = 1 ho jaye, toh 1 print karke recursion stop kar do
        if (n == 1) {
            System.out.println(n);
            return;
        }

        // Print the current number before making the recursive call
        System.out.println(n + " ");

        // Recursive Call: Decrease n by 1 in every call
        printdec(n - 1);
    }

    public static void main(String[] args) {

        // Starting number
        int n = 10;

        // Print numbers from 10 to 1
        printdec(n);
    }
}
