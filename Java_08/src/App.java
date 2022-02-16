import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so bat ki: ");
        float a = input.nextFloat();
        a += 3;
        System.out.println("a += 3 = " + a);
        a -= 2;
        System.out.println("a -= 2 = " + a);
        a *= 3;
        System.out.println("a *= 3 = " + a);
        a /= 2;
        System.out.println("a /= 2 = " + a);
        a %= 2;
        System.out.println("a %= 2 = " + a);
    }
}
