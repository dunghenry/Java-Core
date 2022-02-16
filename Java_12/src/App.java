import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int a = input.nextInt();
        System.out.println("Nhap so thu ghai: ");
        int b = input.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " la so chan.");
        }
        else{
            System.out.println(a + " la so le.");
        }

        if(a > b){
            System.out.println(a + " > " + b);
        }
        else{
            System.out.println(a + " < " + b);
        }
    }
}
