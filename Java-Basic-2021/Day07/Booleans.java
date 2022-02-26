
import java.util.Scanner;
public class Booleans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = input.nextInt();
        final int x = 10;
        System.out.println("Xuat a: " + a);
        System.out.println(a > 0);
        System.out.println(a == 0);
        System.out.println(x);
        input.close();
    }
}
