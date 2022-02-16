import java.util.Scanner;
public class BaiTapHinhTron {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double chuVi, dienTich;
        System.out.println("Nhap ban kinh hinh tron tu ban phim: ");
        double r = in.nextDouble();

        chuVi = (double) 2 * Math.PI * r;
        dienTich = (double) Math.PI * r * r;
        System.out.println("Chu vi la: " + chuVi);
        System.out.println("Chu vi la: " + Math.round(chuVi));
        System.out.println("Chu vi la: " + Math.round(chuVi * 100.0)/ 100.0);
        

        System.out.println("Dien tich la: " + dienTich);
        System.out.println("Dien tich la: " + Math.round( dienTich));
        System.out.println("Dien tich la: " + Math.round(dienTich * 100.0)/ 100.0);
    }
}
