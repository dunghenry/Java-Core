package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sinhVien) {
        this.danhSach.add(sinhVien);
    }

    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    public boolean kiemTraDanhSachRong(){
       return this.danhSach.isEmpty();
    }

    public int laySoLuongDanhSachSinhVien(){
        return this.danhSach.size();
    }

    public void lamRongDanhSachSinhVien(){
        this.danhSach.clear();
        //this.danhdanhSach.removeAll(danhSach);
    }

    public boolean kiemTraSinhVien(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    public boolean xoaSinhVien(SinhVien sv){
        if(kiemTraSinhVien(sv)){
            return this.danhSach.remove(sv);
        }
        else{
            return false;
        }
    }

    public void timKiemSinhVien(String hoVaTen){
        for (SinhVien sinhVien : danhSach) {
            if(sinhVien.getHoVaTen().indexOf(hoVaTen) >= 0){
                System.out.println(sinhVien);
            }
            else{
                System.out.println("Khong tim thay sinh vien");
            }
        }
    }

    public void sapXepGiam(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                
                if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }
                else if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh() ){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
    }
}
