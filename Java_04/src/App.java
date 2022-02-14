import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap ho va ten tu ban phim: ");
        String hoTen = input.nextLine();

        System.out.println("Nhap mot so bat ki tu ban phim: ");
        int x = input.nextInt();
        
        System.out.print("Nhap ma sinh vien cua ban: ");
        long maSinhVien = input.nextLong();

        System.out.print("Nhap diem thi cua ban: ");
        float diemThi = input.nextFloat();

        System.out.println("So ban vua nhap tu ban phim la: " + x);
        System.out.println("Ho ten cua ban la: " + hoTen);
        System.out.println("Ma sinh vien cua ban: " + maSinhVien);
        System.out.println("Diem thi cua ban: " + diemThi);
        input.close();
    }
}
