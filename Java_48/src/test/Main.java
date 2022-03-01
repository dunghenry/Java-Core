package test;

import java.util.Scanner;

import code.DanhSachSinhVien;
import code.SinhVien;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon =  0;
        do {
            System.out.println("----------MENU----------");
            System.out.println("Nhap lua chon cua ban: ");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In danh sach ra man hinh");
            System.out.println("3. Kiem tra danh sach sinh vien co rong hay khong");
            System.out.println("4. Lay ra so luong sinh vien trong danh sach");
            System.out.println("5. Lam rong danh sach");
            System.out.println("6. Kiem tra sinh vien co ton tai trong danh sach hay khong");
            System.out.println("7. Xoa mot sinh vien ra khoi danh sach khi biet ma sinh vien");
            System.out.println("8. Tim kiem tat ca cac sinh vien khi duoc nhap ten tu ban phim");
            System.out.println("9. Xuat sinh vien theo danh sach diem tu cao den thap");
            System.out.println("0. Thoat");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.println("Nhap thong tin sinh vien can them: ");
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                System.out.print("Nhap ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.print("Nhap nam sinh: ");
                int namSinh = sc.nextInt();
                System.out.print("Nhap diem trung binh: ");
                float diemTrungBinh = sc.nextFloat();

                SinhVien  sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
                
            }
            else if (luaChon == 2){
                dssv.inDanhSachSinhVien();
            }
            else if (luaChon == 3){
                System.out.println("Trang thai danh sach sinh vien rong: " + dssv.kiemTraDanhSachRong());
            }
            else if (luaChon == 4){
                System.out.println("So luong sinh vien trong danh sach la: " + dssv.laySoLuongSinhVien());
            }
            else if (luaChon == 5){
                dssv.lamRongDanhSach();
            }
            else if (luaChon == 6){
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach " + dssv.kiemTraTonTai(sv));
            }
            else if (luaChon == 7){
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: " + dssv.xoaSinhVien(sv));
            }
            else if (luaChon == 8){
                System.out.print("Nhap ho ten sinh vien: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dssv.timSinhVien(hoVaTen);
            }
            else if (luaChon == 9){
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();
            }
            else{
                System.out.println("----------Ket Thuc----------");
                break;
            }

        } while (luaChon != 0);
        
    }
}
