
import java.util.Scanner;
public class Bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = input.nextInt();
        System.out.print("Nhap b: ");
        int b = input.nextInt();
        PTBN(a, b);
        input.close();
    }
    public static void PTBN(int a, int b){
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.println("Phong trinh co nghiem: " + (float)-b/a);
        }
    }
}
