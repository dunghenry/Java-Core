
import java.util.Scanner;
public class FunctionInput {
    public static void main(String[] args) {
        int a = nhap();
        System.out.println("Xuat so vua nhap: " + a);
    }
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tu ban phim: ");
        int n = input.nextInt();
        return n;
    }
}
