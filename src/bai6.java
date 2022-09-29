import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng ");
        int size1 = scanner.nextInt();
        System.out.println("Nhập số cột của mảng");
        int size2 = scanner.nextInt();
        double[][] matrix = new double[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhập phần tử " + (j + 1) + " của hàng " + (i + 1));
                matrix[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < size1; i++) {
            System.out.println("");
            for (int j = 0; j < size2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }

        double sum = 0;
        System.out.println("\n Chọn số cột cần tính tổng");
        int col = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col - 1];
        }
        System.out.println("Tổng các số ở cột " + col + " là " + sum);
    }
}

