
import java.util.Scanner;
import java.lang.Math;
public class Bt6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println("Sum la: " + sum(n));
    }
    public static float sum(int n){
        float sum = 0;
        for(int i = 1; i <= n; i++){
            sum += 1.0/i;
        }
        return sum;
    }
}
