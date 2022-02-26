import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot thang bat ki tu ban phim: ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                {
                    System.out.println("Ban vua chon thang 1");
                    break;
                }
            case 2:
                {
                    System.out.println("Ban vua chon thang 2");
                    break;
                }
            case 3:
                {
                    System.out.println("Ban vua chon thang 3");
                    break;
                }
            case 4:
                {
                    System.out.println("Ban vua chon thang 4");
                    break;
                }
            case 5:
                {
                    System.out.println("Ban vua chon thang 5");
                    break;
                }
            case 6:
                {
                    System.out.println("Ban vua chon thang 6");
                    break;
                }
            case 7:
                {
                    System.out.println("Ban vua chon thang 7");
                    break;
                }
            case 8:
                {
                    System.out.println("Ban vua chon thang 8");
                    break;
                }
            case 9:
                {
                    System.out.println("Ban vua chon thang 9");
                    break;
                }
            case 10:
                {
                    System.out.println("Ban vua chon thang 10");
                    break;
                }
            case 11:
                {
                    System.out.println("Ban vua chon thang 11");
                    break;
                }
            case 12:
                {
                    System.out.println("Ban vua chon thang 12");
                    break;
                }
                
        
                default:
                    System.out.println("Lua chon khong hop le haha!");
                    // break;
        }
    }
}
