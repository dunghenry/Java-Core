
import java.util.Scanner;
public class ex2_operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = input.nextInt();
        System.out.print("Nhap so b: ");
        int b = input.nextInt();
        if(a>0 || b>0){
            System.out.println("a or b lon hon 0");
        }
        else{
            System.out.println("a or b khong lon hon 0");
        }
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println(a>b);
        System.out.println("Xuat so a: "+ a);
        System.out.println("Xuat so a: "+ b);
        input.close();
    }
}
