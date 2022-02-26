
import java.util.Scanner;
import java.lang.Math;
public class Bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        input.close();  
        System.out.println("Xuat ket qua: " + sum(n));
    }
    public static float sum(int n){
        float sum = 0;
        float mauSo = 0;
        for(int i = 1; i <= n; i++){
            mauSo += i; 
            sum += 1.0 / mauSo;
        }
        return sum;
    }
}
