package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TuDienHashMap {
    private Map<String, String> dl = new HashMap<String, String>();

    public String themTu(String tuKhoa, String yNghia) {
        return this.dl.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.dl.remove(tuKhoa);

    }

    public String traTu(String tuKhoa) {
        String ketQua = this.dl.get(tuKhoa);
        return ketQua;
    }

    public void inTuKhoa() {
        Set<String> tapHopTuKhoa = this.dl.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong() {
        return this.dl.size();
    }

    public void xoaTatCa() {
        this.dl.clear();
    }

    public static void main(String[] args) {
        TuDienHashMap tuDien = new TuDienHashMap();
        Scanner input = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("---------Menu---------");
            System.out.println("Tra tu dien Anh - Viet");
            System.out.println("1. Them tu(tu khoa, y nghia)");
            System.out.println("2.Xoa tu khoi tu dien");
            System.out.println("3. Tim y nghia cua tu khoa");
            System.out.println("4. In ra danh sach cac tu khoa");
            System.out.println("5. In ra so luong co trong tu dien");
            System.out.println("6. Xoa tat ca ca tu trong tu dien");
            System.out.println("0. Thoat chung trinh");
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = input.nextInt();
            input.nextLine();
            if (luaChon == 1) {
                System.out.print("Nhap tu khoa muon them : ");
                String tuKhoa = input.nextLine();
                System.out.print("Nhap y nghia muon them : ");
                String yNghia = input.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 3) {
                System.out.print("Nhap tu khoa: ");
                String tuKhoa = input.nextLine();
                if (luaChon == 2) {
                    tuDien.xoaTu(tuKhoa);
                } else if (luaChon == 3) {
                    System.out.print("Y nghia cua tu dien la: " + tuDien.traTu(tuKhoa));
                    System.out.println();

                }
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            } else if (luaChon == 5) {
                System.out.print("So luong tu co trong tu dien la: " + tuDien.laySoLuong());
                System.out.println();
            } else if (luaChon == 6) {
                tuDien.xoaTatCa();
            } else {
                System.out.println("Chuong trinh ket thuc");
                break;
            }

        } while (luaChon != 0);
    }
}
