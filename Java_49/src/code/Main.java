package code;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<String> stack = new Stack<String>();

        System.out.print("Nhap vao mot chuoi bat ki: ");

        String str = input.nextLine ();

        for (int i = 0; i < str.length(); i++) {

            stack.push(str.charAt(i) + "");
        }
        System.out.print("Dao nguoc chuoi vua nhap la: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
            //Lay ra va xoa
            
            //System.out.print(stack.peek());
            
        }

        // Dao nguoc chuoi
    }
}
