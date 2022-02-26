
import java.util.Scanner;
public class Bt6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println("Xuat ket qua: " + sum(x, n));
        System.out.println("Xuat ket qua: " + sumTwo(x, n));


    }
    public static float sum(int x, int n){
        float sum = x;
        int tuSo = x;
        int mauSo = 1;
        for(int i = 3; i <= n; i+= 2){
            tuSo *= x * x;
            mauSo *= i*(i - 1);
            sum += (float) tuSo / mauSo;
        }
        return sum;
    }
    public static float sumTwo(int x, int n){
        float sumTwo = x;
        int mauSoTwo = 1;
        for(int i = 3; i <=n; i += 2){
            mauSoTwo *= i *(i - 1);
            sumTwo += (float) Math.pow(x, i) / mauSoTwo;
        }
        return sumTwo;
    }
}
