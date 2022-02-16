import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int sothunhat = input.nextInt();
        System.out.print("Nhap so thu hai: ");
        int sothuhai = input.nextInt();

        System.out.println(sothunhat + " == " + sothuhai + " : " + (sothunhat==sothuhai));
        System.out.println(sothunhat + " != " + sothuhai + " : " + (sothunhat!=sothuhai));
        System.out.println(sothunhat + " > " + sothuhai + " : " + (sothunhat > sothuhai));
        System.out.println(sothunhat + " < " + sothuhai + " : " + (sothunhat > sothuhai));
        System.out.println(sothunhat + " <= " + sothuhai + " : " + (sothunhat <= sothuhai));
        System.out.println(sothunhat + " >= " + sothuhai + " : " + (sothunhat >= sothuhai));
        System.out.println("Ca hai so deu chia het cho 2: " + (sothunhat % 2 == 0 && sothuhai % 2==0));
        System.out.println("Co it nhat mot so chia het cho 2: " + (sothunhat % 2 == 0 || sothuhai % 2 == 0));
        
    }
}
