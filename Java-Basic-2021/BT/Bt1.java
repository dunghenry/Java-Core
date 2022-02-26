
import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int Sum = sum(n);
        System.out.println("Sum la: " + Sum);
        input.close();

    }
    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

}
