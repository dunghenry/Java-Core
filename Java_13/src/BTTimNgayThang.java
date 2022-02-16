import java.util.Scanner;
public class BTTimNgayThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int thang, nam;
        System.out.println("Nhap vao mot nam bat ki de kiem tra so ngay cua mot thang bat ki: ");
        nam = input.nextInt();
        System.out.println("Nhap thang ban muon kiem tra: ");
        thang = input.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang + "cua nam " + nam + " co 31 ngay.");              
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang + "cua nam " + nam + " co 30 ngay.");
                break;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || nam % 100 == 0){
                    System.out.println("Thang " + thang + "cua nam " + nam + " co 29 ngay.");
                }
                else{
                    System.out.println("Thang " + thang + "cua nam " + nam + " co 28 ngay.");
                }
                break;

            default:
                System.out.println("Input khong hop le.");
                break;
        }
    }
}
