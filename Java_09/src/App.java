import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int sothunhat = input.nextInt();
        System.out.print("Nhap so thu hai: ");
        int sothuhai = input.nextInt();

        if(sothunhat == sothuhai) {
            System.out.println("Hai so bang nhau!");
        }
        else if(sothunhat > sothuhai) {
            System.out.println("So thu nhat lon hon so thu hai");
        }
        else if(sothunhat <= sothuhai) {
            System.out.println("So thu nhat nho hon so thu hai");
        }
    }
}
