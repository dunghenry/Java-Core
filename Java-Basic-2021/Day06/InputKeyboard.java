
import java.util.Scanner;
public class InputKeyboard {
    public static void main(String[] args) {
        Scanner nhap = new Scanner (System.in);
        System.out.print("Nhap so bat ki tu ban phim: ");
        int n = nhap.nextInt();
        System.out.println("Xuat so vua nhap tu ban phim: " + n);
        nhap.close();
    }
}
