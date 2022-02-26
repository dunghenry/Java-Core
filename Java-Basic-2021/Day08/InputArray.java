
import java.util.Scanner;
public class InputArray{
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        n = input.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Phan tu thu " + i + " : " +a[i]);
        }
    }
}