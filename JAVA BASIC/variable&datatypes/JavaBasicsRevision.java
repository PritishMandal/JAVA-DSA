
import java.util.Scanner;

public class JavaBasicsRevision {

    // 1. Sum of two numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // 2. Product of two numbers
    static int product(int a, int b) {
        return a * b;
    }

    // 3. Simple Interest
    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // 4. Area of Circle
    static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // Variables and Data Types
        int age = 20;
        double price = 99.99;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Pritish";

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

        // Pattern Printing
        System.out.println("\nPattern:");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Sum and Product
        System.out.println("\nSum: " + sum(10, 20));
        System.out.println("Product: " + product(5, 4));

        // Simple Interest
        System.out.println("Simple Interest: "
                + simpleInterest(1000, 5, 2));

        // Area of Circle
        System.out.println("Circle Area: "
                + areaOfCircle(5));

        // Type Conversion (Widening)
        int a = 10;
        double b = a;

        System.out.println("Widening: " + b);

        // Type Casting (Narrowing)
        double x = 10.75;
        int y = (int) x;

        System.out.println("Casting: " + y);

        // Type Promotion
        byte p = 10;
        byte q = 20;

        int result = p + q;

        System.out.println("Promotion: " + result);

        // Character to Integer
        char ch = 'A';
        int ascii = ch;

        System.out.println("Character value: " + ascii);

        // User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int total = num1 + num2;

        System.out.println("User Input Sum: " + total);

        sc.close();
    }
}

