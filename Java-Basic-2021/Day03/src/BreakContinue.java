import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.print("Nhap mot so tu ban phim: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + "\t");
        }
        input.close();
    }
}
