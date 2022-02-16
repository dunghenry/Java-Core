import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu hai: ");
        double b = input.nextDouble();
        System.out.println("Nhap so thu nhat: ");
        int a = input.nextInt();
        
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("Max(a, b) = " + Math.max(a, b));
        System.out.println("Min(a, b) = " + Math.min(a, b));
        System.out.println("ceil(b) = " + Math.ceil(b));
        System.out.println("floor(b) = " + Math.floor(b));
        System.out.println("sqrt(b) = " + Math.sqrt(b));
        System.out.println("pow(a, b) = " + Math.pow(a,b));

    }
}
