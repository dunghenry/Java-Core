package code;

import java.util.Scanner;
import java.util.Stack;

public class SoNhiPhan {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen tu ban phim: ");
        int number = input.nextInt();

        Stack<String> soNhiPhan = new Stack<String>();
        
        System.out.print("So nhi phan cua " + number + " : ");
        while (number > 0){
            int soDu = number % 2;
            soNhiPhan.push(soDu + "");
            number /= 2;
        }
        int length = soNhiPhan.size();
       
        for (int i = 0; i < length; i++){
            System.out.print(soNhiPhan.pop());
        }
    }
}
