
import java.util.Scanner;
import java.lang.Math;
public class Bt5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = input.nextInt();
        System.out.print("Nhap b: ");
        int b = input.nextInt();
        System.out.print("Nhap c: ");
        int c = input.nextInt();
        PTBH(a, b, c);
        input.close();
        
    }
    public static void PTBH(int a, int b, int c){
        if(a == 0){
            if(b == 0){
               if(c == 0){
                   System.out.println("Phuong trinh co vo so nghiem");
               }
               else{
                   System.out.println("Phuong trinh vo nghiem");;
               }  
            }
            else{
                System.out.println("Phuong trinh co nghiem: "+ -c/b);
            }
        }
        else{
            int delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep: " + -b/(2*a));
            }
            else if(delta > 0){
                System.out.println("Phuong trinh co nghiem: " + (-b + Math.sqrt(delta))/(2 * a));
                System.out.println("phuong trinh co nghiem: " + (-b - Math.sqrt(delta))/(2 * a));
            }
        }
    }
}
