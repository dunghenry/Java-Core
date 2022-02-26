
import java.util.Scanner;
import java.lang.Math;
public class Bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        input.close();
        System.out.println("Xuat ket qua la: " + sum(x, n) );
        System.out.println("Xuat ket qua la: " + sumTow(x, n) );
    }
    public static float sum(int x, int n){
        float sum = x;
        for(int i = 1; i <= n; i++){
            sum += Math.pow(x, 2 * i + 1);
        }
        return sum;
    }
    public static float sumTow(int x, int n){
        float sumTow = x;
        float bien = x;
        for(int i = 3; i <= n; i+=2){
            bien *= x * x; 
            sumTow += bien;
        }
        return sumTow;
    }
}
