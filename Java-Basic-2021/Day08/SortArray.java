
import java.util.Scanner;
public class SortArray {
    public static void Sort(int a[], int n){
        for(int i = 0; i < n -1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = input.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = input.nextInt();
        }
        Sort(a, n);
        System.out.print("Xuat mang sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
