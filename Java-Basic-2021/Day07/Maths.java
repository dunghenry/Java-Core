
import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap y: ");
        int y = input.nextInt();
        System.out.println("Max la: "+ Math.max(x, y));
        System.out.println("Min la: "+ Math.min(x, y));
        System.out.println("Can bac hai la: "+ Math.sqrt(x));
        System.out.println("Gia tri tuyet doi la: "+ Math.abs(y));
        System.out.println("Gia tri random la: "+ Math.random()  * 10);
        input.close();
    }
}
