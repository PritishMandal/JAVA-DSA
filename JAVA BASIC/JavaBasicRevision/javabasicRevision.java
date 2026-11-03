
import java.util.Scanner;
import java.util.Arrays;

public class javabasicRevision {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== JAVA BASIC REVISION =====");
            System.out.println("1. Even or Odd");
            System.out.println("2. Largest of Three Numbers");
            System.out.println("3. Positive Negative Zero");
            System.out.println("4. Calculator");
            System.out.println("5. Multiplication Table");
            System.out.println("6. Factorial");
            System.out.println("7. Prime Number");
            System.out.println("8. Reverse Number");
            System.out.println("9. Palindrome Number");
            System.out.println("10. Sum of Digits");
            System.out.println("11. Fibonacci Series");
            System.out.println("12. Star Pattern");
            System.out.println("13. Number Pattern");
            System.out.println("14. String Operations");
            System.out.println("15. Selection Sort");
            System.out.println("16. Sum of Natural Numbers");
            System.out.println("17. Break and Continue Demo");
            System.out.println("18. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    evenOdd();
                    break;

                case 2:
                    largest();
                    break;

                case 3:
                    positiveNegative();
                    break;

                case 4:
                    calculator();
                    break;

                case 5:
                    multiplicationTable();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    primeNumber();
                    break;

                case 8:
                    reverseNumber();
                    break;

                case 9:
                    palindrome();
                    break;

                case 10:
                    sumOfDigits();
                    break;

                case 11:
                    fibonacci();
                    break;

                case 12:
                    starPattern();
                    break;

                case 13:
                    numberPattern();
                    break;

                case 14:
                    stringOperations();
                    break;

                case 15:
                    selectionSort();
                    break;

                case 16:
                    naturalSum();
                    break;

                case 17:
                    breakContinueDemo();
                    break;

                case 18:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 18);

        sc.close();
    }

    // 1. Even or Odd
    static void evenOdd() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    // 2. Largest of Three
    static void largest() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }

    // 3. Positive Negative Zero
    static void positiveNegative() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    // 4. Calculator
    static void calculator() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }

    // 5. Multiplication Table
    static void multiplicationTable() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 6. Factorial
    static void factorial() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Enter number between 0 and 20");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }

    // 7. Prime Number
    static void primeNumber() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean prime = n > 1;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }

    // 8. Reverse Number
    static void reverseNumber() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        System.out.println("Reverse: " + rev);
    }

    // 9. Palindrome Number
    static void palindrome() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if (temp >= 0 && temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // 10. Sum of Digits
    static void sumOfDigits() {
        System.out.print("Enter number: ");
        int n = Math.abs(sc.nextInt());

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }

    // 11. Fibonacci Series
    static void fibonacci() {
        System.out.print("Enter terms: ");
        int n = sc.nextInt();

        if (n < 0 || n > 92) {
            System.out.println("Enter terms between 0 and 92");
            return;
        }

        long a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            long next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }

    // 12. Star Pattern
    static void starPattern() {
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 13. Number Pattern
    static void numberPattern() {
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 14. String Operations
    static void stringOperations() {
        sc.nextLine();

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("First Character: " +
                (s.isEmpty() ? "No character" : s.charAt(0)));
        System.out.println("Trim: " + s.trim());
    }

    // 15. Selection Sort
    static void selectionSort() {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: "
                + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("After Sorting: "
                + Arrays.toString(arr));
    }

    // 16. Sum of Natural Numbers
    static void naturalSum() {
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }

    // 17. Break and Continue
    static void breakContinueDemo() {

        System.out.println("Break Example:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;

            System.out.print(i + " ");
        }

        System.out.println("\nContinue Example:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;

            System.out.print(i + " ");
        }

        System.out.println();
    }
}
