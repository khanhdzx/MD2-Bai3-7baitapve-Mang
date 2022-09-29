import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So luong phan tu cua mang : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int min = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu " + i + " : ");
            arr[i] = scanner.nextInt();
            if (i == 0) {
                min = arr[i];
            }
            min = Math.min(min, arr[i]);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("GTNN trong mang la : " + min);
    }
}

