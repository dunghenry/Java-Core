import java.util.Scanner;
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        //ax + b = 0
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = input.nextInt();
        
        System.out.println("Nhap b: ");
        b = input.nextInt();

        if(a==0){
            if(b==0){
                System.out.println("Pt co vo so nghiem.");
            }
            else{
                System.out.println("Pt vo nghiem.");
            }
        }
        else{
            System.out.println("Pt co nghiem: " + (double)-b/a);
        }
    }
}
