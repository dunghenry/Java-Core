import java.util.Scanner;
public class HinhVuong {
    public static int chuViHinhVuong(int x) {
        return x * 4;
    }
    public static int dienTichHinhVuong(int x) {
        return (int) Math.pow(x, 2);
    }
    public static void main(String[] args) {
        System.out.print("Nhap canh cua hinh vuong tu ban phim: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Chu vi hinh vuong la: " + chuViHinhVuong(x));
        System.out.println("Dien tich hinh vuong la: " + dienTichHinhVuong(x));
        input.close();
    }
}