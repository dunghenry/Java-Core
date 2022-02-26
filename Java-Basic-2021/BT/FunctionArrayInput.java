
import java.util.Scanner;
public class FunctionArrayInput {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri nguyen n : ");
        n = input.nextInt();
        int a[] = new int[n];
        input(a, n);
        System.out.print("Xuat mang vua nhap: ");
        output(a, n);
    }
    public static void input(int a[], int n){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = input.nextInt();
        }
    }
    public static void output(int a[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
