import java.util.Scanner;
public class HinhChuNhat {
    public static void chuViHinhTron(int d, int r) {
        int C = (d + r) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + C);
    }
    public static void dienTichHinhTron(int d, int r) {
        float S = d * r;
        System.out.println("Dien tich hinh chu nhat la: " + S);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat tu ban phim: ");
        int d = input.nextInt();
        System.out.print("Nhap chieu rong cua hinh chu nhat tu ban phim: ");
        int r = input.nextInt();
        chuViHinhTron(d, r);
        dienTichHinhTron(d, r);
    }
}