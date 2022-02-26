import java.util.Scanner;

class DoWhile {
    public static void main(String[] args) {
        //DoWhile chạy 1 lần đầu tiên cho dù đk đúng hoặc sai
        System.out.print("Nhap mot so bat ki tu ban phim: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        do {
            i++;
            System.out.print(i + "\t");
            
        } while (i < n);
        input.close();
    }
}