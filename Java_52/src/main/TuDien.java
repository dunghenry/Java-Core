package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> dl = new TreeMap<String, String>();
    public String themTu(String tuKhoa, String yNghia){
        return this.dl.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.dl.remove(tuKhoa);
    }

    public String traTu(String tuKhoa){
        String ketQua = this.dl.get(tuKhoa);
        return ketQua;
    }

    public void inTuKhoa(){
        Set<String> tapHopTuKhoa = this.dl.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong() {
        return this.dl.size();
    }

    public void xoaTatCa(){
        this.dl.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        Scanner input = new Scanner(System.in);
        int luaChon = 0;

        do {
            System.out.println("---------Menu---------");
            System.out.println("Tra tu dien Anh - Viet");
            System.out.println("1. Them tu(tukhoa, y nghia");
            System.out.println("2. Xoa tu");
            System.out.println("3. Tim y nghia cua tu khoa");
            System.out.println("4. In ra danh dach cac tu khoa");
            System.out.println("5. In ra so luong tu");
            System.out.println("6. Xoa tat cac ca tu ");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon cua ban: ");
            luaChon = input.nextInt();
            input.nextLine();

            if(luaChon == 1){
                System.out.print("Nhap tu khoa: ");
                String tuKhoa = input.nextLine();
                System.out.print("Nhap y nghia: ");
                String yNghia = input.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            }
            else if(luaChon == 2 || luaChon == 3){
                System.out.print("Nhap tu khoa: ");
                String tuKhoa = input.nextLine();
                if(luaChon == 2){
                    tuDien.xoaTu(tuKhoa);
                }
                else{
                    System.out.print("Y nghia la: " + tuDien.traTu(tuKhoa));
                    System.out.println();
                }
            }
            else if(luaChon == 4){
                tuDien.inTuKhoa();
            }
            else if(luaChon == 5){
                System.out.print("So luong tu khoa la : " + tuDien.laySoLuong());
            }
            else if(luaChon == 6){
                tuDien.xoaTatCa();
            }
            else{
                System.out.println("-----Ket thuc-----");
                break;
            }
            
        } while (luaChon != 0);
    }
}
