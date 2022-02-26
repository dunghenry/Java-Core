
import java.util.Scanner;
public class testInput {
	public static void main(String[] args) {
		Scanner nhapdulieu = new  Scanner(System.in);
		System.out.printf("Nhap mot so bat ki: ");
//		int a = nhapdulieu.nextInt();
		float a = nhapdulieu.nextFloat();
		System.out.printf("So vua nhap la: "+ a);
		nhapdulieu.close();
	}
}


