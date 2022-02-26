package BaiTapArray;
import java.util.Scanner;
public class Xoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        int a[] = new int[n];
        Input(a, n);
        System.out.print("Nhap vi tri can xoa: ");
        int vt = input.nextInt();
        xoa(a, n, vt);
        System.out.print("Xuat mang: ");
        OutputXoa(a, n);
    }
    public static void Input(int a[], int n){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = input.nextInt();
        }
    }
    public static void OutputXoa(int a[], int n){
        for(int i = 0; i < n - 1; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void xoa(int a[], int n, int vt) {
        for (int i = vt; i < n - 1; i++)
            a[i] = a[i + 1];
    }
}
