package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double taiKhoanNguoiChoi = 5000000;
        //Locale lc = new Locale("vi", "VN");
        Locale lc = new Locale("en", "US");
        //NumberFormat numf = NumberFormat.getInstance(lc);
        
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int luaChon = 0;

        do {
            System.out.println("Nhap lua chon cua ban!");

            System.out.println("Chon (1) de tiep tuc choi.");
            System.out.println("Chon mot phim bat ki de thoat.");
            luaChon = input.nextInt();
            if (luaChon == 1) {
                System.out.println("Bat dau: ");
                System.out.println("Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi) + ", ban muon cuoc bao nhieu: ");

                double datCuoc;
                do {
                    System.out.println("Dat cuoc (0 < so tien cuoc " + numf.format(taiKhoanNguoiChoi) + " )");
                    datCuoc = input.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                int taiXiu = 0;
                do {
                    System.out.println("Chon 1(Tai) hoac 2(Xiu)");
                    taiXiu = input.nextInt();
                } while (taiXiu != 1 && taiXiu != 2);

                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int gt1 = xucXac1.nextInt(5) + 1;
                int gt2 = xucXac2.nextInt(5) + 1;
                int gt3 = xucXac3.nextInt(5) + 1;
                int tong = gt1 + gt2 + gt3;
                //System.out.println(gt1 + gt2 + gt3);

                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("Ban da thua");
                    System.out.println("Tai khoan cua ban con lai la: " + numf.format(taiKhoanNguoiChoi));
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("Xiu");
                    if (luaChon == 2) {
                        System.out.println("Ban da thang");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("Ban da thua");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("Tai");
                    if (luaChon == 1) {
                        System.out.println("Ban da thang");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("Ban da thua");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Tai khoan cua ban la: " + numf.format(taiKhoanNguoiChoi));
                    }
                }
            }
            else{
                System.out.println("Ket thuc");
                break;
            }

        } while (luaChon == 1);
        
    }

}
