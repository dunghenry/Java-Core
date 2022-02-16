import java.util.Scanner;
public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0

        Scanner input = new Scanner(System.in);
        double a, b, c, delta;
        System.out.println("Nhap a: ");
        a = input.nextDouble();
        System.out.println("Nhap b: ");
        b = input.nextDouble();
        System.out.println("Nhap c: ");
        c = input.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Pt vo nghiem.");
            }
            else{
                System.out.println("Pt co nghiem: " + (double) -c /b );
            }
        }
        else{
            delta = b * b - 4 * a *c;
            if(delta < 0){
                System.out.println("Pt vo nghiem.");
            }
            else if( delta  == 0){
                System.out.println("Pt co nghiem: " +  (double) -b / (2 * a));
            }
            else{
                System.out.println("Pt co nghiem thu nhat : " + (double) (-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Pt co nghiem thu nhat : " + (double) (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}
