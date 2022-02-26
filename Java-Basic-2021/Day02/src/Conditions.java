import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so tu ban phim: ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("So vua nhap la so chan!");
        }
        else {
            System.out.println("So vua nhap la so le!!");
        }
        System.out.print("Nhap mot so tu ban phim: ");
        int b = input.nextInt();
        if (b % 2 == 0) {
            if (b == 4) {
                System.out.println("Vua chia het cho 2 va bang 4");
            } else {
                System.out.println("Chia het cho 2 và khong bang 4");
            }
        }
        System.out.print("Nhap mot so tu ban phim: ");
        int c = input.nextInt();

        if (c == 5) {
            System.out.println("Bang 5");
        }
        else if (c > 5) {
            System.out.println("Lon hơn 5");
        }
        else{
            System.out.println("Nho hon 5");
        }
        System.out.println("Ket thuc!");
            
    }
}
