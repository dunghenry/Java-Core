
import java.util.Scanner;
public class FunctionArray {
    private int a[] = new int[100];
    int n = 5;
    public void Input(){
        Scanner sc =new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + i + " : ");
            a[i] = sc.nextInt();
        }
    }
    public void Output(){
        System.out.print("Xuat mang: ");
        for(int i = 0; i < n; i++)
           System.out.print(a[i]+ " ");
    }
    public static void main(String[] args) {
        FunctionArray vidu = new FunctionArray();
        vidu.Input();
        vidu.Output();
    }
}
