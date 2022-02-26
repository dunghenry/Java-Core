
import java.util.Scanner;
public class DeQuy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap start: ");
        int start = input.nextInt();
        System.out.print("Nhap end: ");
        int end = input.nextInt();
        System.out.println("Ket qua la: " + sum(start, end));
        input.close();
    }
    public static int sum(int start, int end){
        if(start < end){
            return end + sum(start, end-1);
        }
        else{
            return end;
        }
    }
}
