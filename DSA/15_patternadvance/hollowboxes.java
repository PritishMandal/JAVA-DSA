public class hollowboxes {
public static void hollowboxes(int height, int rows, int cols) {
    for (int h = 1; h <= height; h++) {
        System.out.println("Layer " + h);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (h == 1 || h == height ||
                    i == 1 || i == rows ||
                    j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int height = 3; // Number of layers
        int rows = 5;   // Number of rows in  layer
        int cols = 7;   // Number of columns in layer

        hollowboxes(height, rows, cols);
    }}
