import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int a = input.nextInt();
        System.out.println("Nhap so thu hai: ");
        int b = input.nextInt();
        String msg = (a % 2 == 0) ? (a + " la so chan") : (a + " khong phai la so chan");
        System.out.println(msg);
    }
}
