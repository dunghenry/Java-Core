package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luaChon = 0;
        DanhSachSinhVien dssv = new DanhSachSinhVien();

        do {
            System.out.println("----------Menu---------");
            
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In ra danh sach");
            System.out.println("3. Kiem tra danh sach co rong hay khong");
            System.out.println("4. Lay so luong sinh vien trong danh sach co rong");
            System.out.println("5. Lam rong danh sach sinh vien");
            System.out.println("6. Kiem tra sinh vien co trong danh sach hay khong dua vao ma sinh vien nhap vao tu ban phim");
            System.out.println("7. Xoa mot sinh vien dua vao ma sinh vien nhap tu ban phim");
            System.out.println("8. Tim kiem tat ca sinh vien dua vao ten nhap tu ban phim");
            System.out.println("9. Xuat ra danh sach sinh vien co diem tu cao den thap");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = input.nextInt();
            input.nextLine();
            if(luaChon == 1){
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = input.nextLine();
                System.out.print("Nhap ho va ten sinh vien: ");
                String hoVaTen = input.nextLine();
                System.out.print("Nhap nam sinh sinh vien: ");
                int namSinh = input.nextInt();
                System.out.print("Nhap diem trung binh: ");
                float diemTrungBinh = input.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
            }
            else if (luaChon == 2){
                dssv.inDanhSachSinhVien();
            }
            else if (luaChon == 3){
                System.out.printf("Trang thai danh sach sinh vien rong: " + dssv.kiemTraDanhSachRong());
                System.out.println();
            }
            else if (luaChon == 4){
                System.out.printf("So luong sinh vien trong danh sach la: " + dssv.laySoLuongDanhSachSinhVien());
                System.out.println();
            }
            else if (luaChon == 5){
                dssv.lamRongDanhSachSinhVien();
                System.out.print("Successfully");
            }
            else if (luaChon == 6){
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = input.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Sinh vien co ton tai khong: " + dssv.kiemTraSinhVien(sv));
            }
            else if (luaChon == 7){
                System.out.print("Nhap ma sinh vien: ");
                String maSinhVien = input.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                dssv.xoaSinhVien(sv);
                
            }
            else if (luaChon == 8){
                System.out.print("Nhap ho va ten sinh vien: ");
                String hoVaTen = input.nextLine();
                System.out.print("Ket qua tim kiem: ");
                dssv.timKiemSinhVien(hoVaTen);
                System.out.println();
            }
            else if (luaChon == 9){
                dssv.sapXepGiam();
            }
            else{
                System.out.println("Ket thuc chuong trinh");
                break;
            }

        } while (luaChon != 0);
    }
}
