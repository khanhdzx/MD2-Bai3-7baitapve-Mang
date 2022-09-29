import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.print("NHAP CHUOI : ");
        str = scanner.nextLine();
        System.out.print("NHAP KY TU CAN TIM : ");
        char kyTu = scanner.next().charAt(1);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("SO LAN XUAT HIEN " + kyTu +
                " TRONG CHUOI " + str + " = " + count);


    }
}
