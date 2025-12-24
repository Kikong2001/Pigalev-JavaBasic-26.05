package hillel.java.pigalev.basic.hw15;

public class PyramidArray {
    public static void main(String[] args) {
        int row = 5;
        int[][] pyramidArray = new int[row][];
        System.out.println("----------Start to program:----------");
        for (int i = 0; i < row; i++) {
            pyramidArray[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramidArray[i][j] = j + 1;
            }
        }
        System.out.println("Pyramid array:");
        for (int i = 0; i < row; i++) {
            for (int s = 0; s < row - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < pyramidArray[i].length; j++) {
                System.out.print(pyramidArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Revers pyramid array:");
        for (int i = row-1; i >= 0; i--) {
            for (int s = 0; s < row - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < pyramidArray[i].length; j++) {
                System.out.print(pyramidArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}