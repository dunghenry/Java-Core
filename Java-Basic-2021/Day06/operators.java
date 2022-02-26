
import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a tu ban phim: ");
        int a = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Nhap b tu ban phim: ");
        int b = input1.nextInt();
        int c = a + b;
        int d = a * b;
        if(a>b){
            System.out.println("a lon hon b");
        }
        else{
            System.out.println("a nho hon b");
        }
        System.out.println("Xuat so a: " + a);
        System.out.println("Xuat so b: " + b);
        System.out.println("Xuat so c: " + c);
        System.out.println("Xuat so d: " + d);
        input1.close();
        input.close();
    }
}
