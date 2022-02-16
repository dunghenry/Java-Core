import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tu nhien tu 0 -> 8: ");
        n = input.nextInt();
        switch (n) {
            case 0:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 1:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 2:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 3:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 4:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 5:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 6:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 7:
                System.out.println("So ban vua nhap la: " + n);
                break;
            case 8:
                System.out.println("So ban vua nhap la: " + n);
                break;

            default:
                System.out.println("So ban vu nhap khong hop le.");
                break;
        }
    }
}
