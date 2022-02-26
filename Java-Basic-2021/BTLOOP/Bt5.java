
import java.util.Scanner;
public class Bt5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println("Xuat ket qua la: " + sum(x, n));
        System.out.println("Xuat ket qua la: " + sumTwo(x, n));
        System.out.println("Xuat ket qua la: " + sumThree(x, n));
        System.out.println("Xuat ket qua la: " + sumFour(x, n));
    }
    public static float sum(int x, int n){
        float sum = x;
        int mauSo = 1;
        int tuSo = 1;
        for(int i = 2; i <= n; i+=2){
            tuSo *= x * x;
            mauSo *= i * ( i -1);
            sum += (float) tuSo / mauSo;
        }
        return sum;
    }
    public static float sumTwo(int x, int n){
        float sumTwo = x;
        int mauSoTwo = 1;
        for(int i = 2; i <= n; i += 2){
            mauSoTwo *= i * (i - 1);
            sumTwo += (float) Math.pow(x, i) / mauSoTwo;
        }
        return sumTwo;
    }
    public static float sumThree(int x, int n){
        float sumThree = x;
        int tuSoThree = 1;
        int mauSoThree = 1;
        for(int i = 1; i <= n; i++){
            tuSoThree *= x * x;
            mauSoThree *=(2 * i)*(2*i - 1);
            sumThree += (float) tuSoThree / mauSoThree;
        }
        return sumThree;
    }
    public static float sumFour(int x, int n){
        float sumFour = x;
        int mauSoFour = 1;
        for(int i = 1; i <= n; i++){
            mauSoFour *= (2 * i) * (2 * i - 1);
            sumFour += (float) Math.pow(x, 2*i) / mauSoFour;
        }
        return sumFour;
    }
}
