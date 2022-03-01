package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RutThamTrungThuong_TreeSet {

    public RutThamTrungThuong_TreeSet() {
    }
    Set<String> thungPhieuDuThuong = new TreeSet<String>();


    public boolean themPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public int laySoLuong(){
        return this.thungPhieuDuThuong.size();
    }

    public String rutTham(){
        String ketQua = "";
        Random rand = new Random();
        int viTri = rand.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }

    public void xoaTatCaCacPhieuDuThuong(){
        this.thungPhieuDuThuong.clear();
    }

    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Them ma so du thuong");
            System.out.println("2. Xoa mot ma so du thuong");
            System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong");
            System.out.println("4. Xoa tat ca cac phieu du thuong");
            System.out.println("5. So luong phieu du thuong");
            System.out.println("6. Rut tham trung thuong");
            System.out.println("7. In ra tat ca cac phieu");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1 || luaChon == 2 || luaChon == 3){
                System.out.print("Nhap vao ma so du thuong: ");
                String giaTri = sc.nextLine();
                if(luaChon == 1){
                    rt.themPhieu(giaTri);
                }
                else if(luaChon == 2){
                    rt.xoaPhieu(giaTri);
                }
                else{
                    System.out.println("Ket qua kiem tra: " + rt.kiemTraPhieuTonTai(giaTri));
                }
            }
            else if(luaChon == 4){
                rt.xoaTatCaCacPhieuDuThuong();
            }
            else if(luaChon == 5){
                System.out.println("So luong phieu la: " + rt.laySoLuong());
            }
            else if(luaChon == 6){
                System.out.println("Ma so trung thuong la: " + rt.rutTham());
            }
            else if(luaChon == 7){
                System.out.println("Tat ca cac ma phieu du thuong la: ");
                rt.inTatCa();
            }
            else{
                System.out.println("--------Ket Thuc----------");
                break;
            }

        } while (luaChon != 0);
    }

}
