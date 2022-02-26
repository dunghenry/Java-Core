
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        // System.out.println("So fibonacci thu n la: " + soFibonacci(n));
        soFibonacciTwo(n);
    //    so(n);

    }
    public static int soFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return soFibonacci(n -1) + soFibonacci(n -2);
        
    }
    public static void soFibonacciTwo(int n){
        int first = 0; 
        int second = 1;
        int number;
        for(int i = 0; i < n; i++){
            if(n <=1){
                number = n;
            }
            else{
            number = first + second;
            first = second;
            second = number;
            }
            System.out.println(number);
        }
         
    }
    public static void so(int n){
        int so1 = 1;
        int so2 = 1;
        int soN = 1;
        for(int i = 3; i <= n; i++){
            soN = so1 + so2;
            so1 = so2;
            so2 = soN;
        }
        System.out.println(soN);
    }
    
}
