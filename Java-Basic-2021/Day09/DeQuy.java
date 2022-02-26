
import java.util.Scanner;
public class DeQuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println("Xuất kq: " + Tong(n));
        input.close();
    }
    static int Tong(int n){
        if(n <= 0)
            return 0;
        else{
            return n + Tong(n -1);
        }
    }
}
