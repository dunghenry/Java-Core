
import java.util.Scanner;
public class Bt4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println("Sum la: " + sum(n));
        input.close();

    }
    public static int sum(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++)
            sum += i;
        return sum;
    }
}
