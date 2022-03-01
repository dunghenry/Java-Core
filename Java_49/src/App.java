import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        // stack.push("Xin chao");// Dua gia tri vao stack
        // stack.pop();//Lay gia tri ra va xoa khoi stack
        // stack.peek();//Lay gia tri ra nhuwng khong xoa khoi stack
        // stack.clear();//Xoa tat ca cac gia trij trong stack]
        // stack.contains("Gia tri"); //Xac dinh gia tri co ton tai trong stack hay khong
        // stack.size() Lay ra do dai cua stack

        System.out.print("Nhap vao chuoi bat ki tu ban phim: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + "");
        }

        System.out.println("Chuoi dao nguoc lai la: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
        System.out.println("--------------------------------------");
        Stack<String> sN = new Stack<String>();

        System.out.print("Nhap so nguyen tu ban phim: ");
        int x = sc.nextInt();
        while (x > 0){
            int soDu = x % 2;
            sN.push(soDu + "");
            x /= 2;
        }
        int length = sN.size();
        System.out.println("Chuyen doi so nguyen sang so nhi phan la: ");
        for (int i = 0; i < length; i++){
            System.out.print(sN.pop());
        }
    }
}
