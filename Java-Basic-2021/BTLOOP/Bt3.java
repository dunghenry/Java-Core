
import java.lang.Math;
import java.util.Scanner;
public class Bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println("Xuat ket qua la: "+ sum(x, n));
        System.out.println("Xuat ket qua la: "+ sumTwo(x, n));
        input.close();
    }
    public static float sum(int x, int n){
        float sum = 0;
        int tuSo = 1;
        int mauSo = 0;
        for(int i = 1; i <= n; i++){
            tuSo *= x;
            mauSo += i;
            sum += (float)tuSo / mauSo;
        }
        return sum;
    }
    public static float sumTwo(int x, int n){
        float sumTwo = 0;
        int mauSoTwo = 0;
        for(int i = 1; i <= n; i++){
            mauSoTwo += i;
            sumTwo += (float) Math.pow(x, i) / mauSoTwo;
        }
        return sumTwo;
    }
}
