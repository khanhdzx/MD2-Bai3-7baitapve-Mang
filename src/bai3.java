import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang 1 : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0;i< array.length;i++){
            System.out.println("Nhap phan tu : " + i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhap so phan tu cua mang 2 : ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i=0;i< array1.length;i++){
            System.out.println("Nhap phan tu : " + i);
            array1[i]= scanner.nextInt();
        }
        int length = array.length + array1.length;
        int[] arrayGop = new int[length];

        for (int i=0;i < array.length; i++){
            arrayGop[i] = array[i];
        }
        System.out.println("Tang so pt cho mang 1 : " + Arrays.toString(arrayGop));
        for (int k = array.length; k < arrayGop.length; k++){
            arrayGop[k] = array1[k - array.length];
        }

        System.out.println("Mang moi sau khi nhap : "+Arrays.toString(arrayGop));

    }
}
