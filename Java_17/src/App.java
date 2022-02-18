import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double mang1[];
        double[] mang2;
        mang1 = new double[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < mang1.length; i++) {
            System.out.print("Nhap phan tu thu: " + i + " = " + " ");
            mang1[i] = input.nextDouble();
        }
        double tong = 0;
        for(int i = 0; i < mang1.length; i++){
            System.out.print( mang1[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < mang1.length; i++){
            tong += mang1[i];
        }
        System.out.print("Tong cac phan tu cua mang 1 la: " + tong);

        System.out.println("");
        mang2 = new double[]{1, 2, 3, 4};
        System.out.print("Cac phan tu mang 2 la: ");
        for(int i = 0; i < mang2.length; i++){
            System.out.print( mang2[i] + " ");
        }

    }
}
