import java.util.Scanner;
public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap mot so bat tu ban phim: ");
        int n = input.nextInt();
        int i = 10;
        do {
            i++;
            System.out.println(i);
        } while (i < n);
    }
}
