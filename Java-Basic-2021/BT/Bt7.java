

import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");   
        int n = input.nextInt();
        if(n <= 1){
            System.out.print("Nhap lai n:");
            n = input.nextInt();
        }
        System.out.println("GT la: " + GT(n));
        input.close();
    }
    public static int GT(int n){
        int GT = 1;
        for(int i = 1; i <= n; i++){
            GT *= i;
        }
        return GT;
    }
}
