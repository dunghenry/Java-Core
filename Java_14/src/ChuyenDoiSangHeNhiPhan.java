import java.util.Scanner;
public class ChuyenDoiSangHeNhiPhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so bat ki lon hon 0: ");
        int n = input.nextInt();
        String nhiPhan = "";
        while(n > 0){
            nhiPhan = (n % 2) + nhiPhan;
            n/=2;
        }
        System.out.println("Chuyen sang he nhi phan la: " + nhiPhan);
    }
}
