import java.util.Scanner;
public class ToanTuBaNgoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot thang bat ki tu ban phim: ");
        int a = input.nextInt();
        String msg;
        msg = (a % 2 == 0) ? "So chan" : "So le";
        System.out.println(msg);
    }
}
