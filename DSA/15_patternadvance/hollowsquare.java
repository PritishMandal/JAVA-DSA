public class hollowsquare {

    public static void hollowSquare(int n) {

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) {      // COLUMNS

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");   //  spaces
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowSquare(5);
    }
}
