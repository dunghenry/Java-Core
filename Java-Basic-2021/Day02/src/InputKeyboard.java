import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so tu ban phim: ");
        int x = input.nextInt();
        System.out.println("So vua nhap la: " + x);
        input.close();
        System.out.print("Nhap so thuc: ");
        float a = input.nextFloat();
        System.out.print("Nhap so tu ban phim: ");
        long b = input.nextLong();
        System.out.print("Tong hai so la: " + a + b);
        short v = input.nextShort();
        boolean check = input.nextBoolean();
        String str = input.nextLine();
    }
}
