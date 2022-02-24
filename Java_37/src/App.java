import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " + str);
        System.out.println("Do dai chuoi vua nhap la: " + str.length());

        for (int i = 0; i < str.length(); i++) {
            System.out.println("vi tri " + i + " la " + str.charAt(i));
        }

        char[] arr = new char[100];
        str.getChars(2, 4, arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        byte[] arr1 = str.getBytes();
        for (byte b : arr1) {
            System.out.print(b + " ");
        }
    }
}
