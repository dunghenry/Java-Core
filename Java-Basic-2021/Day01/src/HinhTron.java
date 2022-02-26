import java.util.Scanner;
public class HinhTron {
    public static final float PI = 3.14f;
    public static void chuViHinhTron(int r) {
        float C = 2 * PI * r;
        System.out.println("Chu vi hinh tron la: " + C);
    }
    public static void dienTichHinhTron(int r) {
        float S = PI * r * r;
        System.out.println("Dien tich hinh tron la: " + S);
    }
    public static void main(String[] args) {
        System.out.print("Nhap ban kinh cua hinh tron tu ban phim: ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        chuViHinhTron(r);
        dienTichHinhTron(r);
        input.close();
    }
}
