
import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        // ! Tổng 10 số chẵn đầu tiên tức là n = 2*10
        int n = 20;
        int sum = sum(n);
        System.out.println("Tong 10 so chan dau tien la: " + sum);
    }
    public static int sum(int n){
        int sum = 0;
        for(int i = 2; i <= n; i += 2){
            sum += i;
        }
        return sum;
    
    }
}
