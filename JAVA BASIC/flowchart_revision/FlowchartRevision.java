package flowchart_revision;

public class FlowchartRevision {

    // 1. Sum of Two Numbers
    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    // 2. Simple Interest
    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 3. Maximum of Three Numbers
    static int maxOfThree(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }
        else if (b >= a && b >= c) {
            return b;
        }
        else {
            return c;
        }
    }

    // 4. Prime Number
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 5. Sum of First N Natural Numbers
    static int sumOfNaturalNumbers(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Sum: " + sumOfTwo(10, 20));

        System.out.println("Simple Interest: "
                + simpleInterest(1000, 5, 2));

        System.out.println("Maximum: "
                + maxOfThree(10, 25, 15));

        System.out.println("Prime: "
                + isPrime(7));

        System.out.println("Natural Sum: "
                + sumOfNaturalNumbers(5));
    }
}

