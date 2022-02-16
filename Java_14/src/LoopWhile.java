import java.util.Scanner;
public class LoopWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so bat i tu ban phim: ");
        int n = input.nextInt();
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i++;
            if(i == 10)
                break;
        }
    }
}
