import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = input.nextInt();
        System.out.print("Nhap so b: ");
        b = input.nextInt();

        int t = a + b;
        int h = a - b;
        int tich = a * b;
        float thuong = (float) a / b;
        float du = a % b;
        System.out.println("Tong la :" + t);
        System.out.println("Hieu la :" + h);
        System.out.println("Tich la :" + tich);
        System.out.println("Thuong la :" + thuong);
        System.out.println("Phan du la :" + du);
        input.close();
    }
}
