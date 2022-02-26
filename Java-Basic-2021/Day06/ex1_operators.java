
import java.util.Scanner;
public class ex1_operators {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Nhap so b: ");
        int b = input2.nextInt();
        if(a>0 && b>0){
            System.out.println("Hai so deu lon hon 0");
        }
        else{
            System.out.println("Ca hai so deu khong lon hon 0");
        }
        input1.close();
        input2.close();
        if(a % 2 == 0){
            System.out.println("a la so chan");
        }
        else{
            System.out.println("a la so le");
        }
        
    }
}
