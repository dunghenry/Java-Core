
import java.util.Scanner;
public class StringsType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap ho va ten: ");
        String fullName = input.nextLine();
        System.out.printf("Nhap ten: ");
        String firstName = input.nextLine();
        System.out.printf("Nhap ho: ");
        String lastName = input.nextLine();
        String text = "Hello \"world\"";
        System.out.println("Output: " +fullName);
        System.out.println(fullName.indexOf("Hello"));
        System.out.println("Output: " + firstName);
        System.out.println("Output: " + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        input.close();
    }
}
