import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        int number = 0;
//        int n = 2;
//        int count = 0;
//        System.out.println("Hai muoi so nguyen to dau tien la : ");
//        while (number < 20) {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                number++;
//                System.out.print(n + " / ");
//            }
//            count = 0;
//            n++;
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng SNT đầu tiên muốn in ra = ");
        int number = scanner.nextInt();
        int n = 2;
        int i;
        boolean check = true;
        int count = 0;
        while (count < number) {
            n++;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;                } else {
                    check = true;

                }
            }
            if (check){
                System.out.print(n + " / ");
                count++;
            }
        }

    }
}

