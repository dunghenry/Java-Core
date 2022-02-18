import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Nhap mot so nguyen bat ki: ");
            n = input.nextInt();
        } catch (Exception e) {
           System.out.println("Du lieu nhap khong dung dinh dang");
        }finally{
            System.out.println("Finally!");
        }
        System.out.print("Gia tri vua nhap la: " + n + "\n");
        System.out.println("Ket thuc");

    }
}
