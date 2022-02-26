
import java.util.Scanner;
import java.lang.Math;
public class Bt8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = input.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = input.nextInt();
        }
        sortDecrease(a, n);
        System.out.print("Xuat mang giam dan: ");
        for(int i= 0; i < n; i++){
           System.out.print(a[i] + " ");
        }
        System.out.println();
        sortIncrease(a, n);;
        System.out.print("Xuat mang tang dan: ");
        for(int i= 0; i < n; i++){
           System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Phan tu lon nhat la cua mang la: "+ searchMax(a, n));
        System.out.println("Phan tu nho nhat la cua mang la: "+ searchMin(a, n));
        System.out.println("So luong phan tu chan la: " + Dem(a, n));
        System.out.print("Nhap gia tri x: ");
        int x = input.nextInt();
        searchX(a, n, x);
        lietKeSNT(a, n);

    }
    public static void sortDecrease(int a[], int n){
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] < a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    } 
    public static void sortIncrease(int a[], int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    public static int searchMax(int a[], int n){
        int max = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static int searchMin(int a[], int n){
        int min = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static int Dem(int a[], int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0)
                count++;
        }
        return count;
    }
    public static void searchX(int a[], int n, int x){
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                System.out.println("Tim thay gia tri cua x la: " + a[i]);
                System.out.println("Vi tri cua x la: " + i);
            }
        }
    }
    public static boolean soNguyenTo(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void lietKeSNT(int a[], int n){
        System.out.print("Xuat so nguyen to cua mang: ");
        for(int i = 0; i < n; i++){
            if(soNguyenTo(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
}
