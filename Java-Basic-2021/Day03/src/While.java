import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.print("Nhap mot so tu ban phim: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;

        while (i < n) {
            i++;
            System.out.print(i + "\t");
        }
        System.out.println();
        
        while (i < n) {
            i++;
            System.out.print(i + "\t");
            if (i == 5) {
                break;
            }

        }
        
        while (i < n) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + "\t");
            
           
        }
        input.close();
    }
}
