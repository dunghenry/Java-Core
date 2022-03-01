package code;

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

    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void inDanhSachSinhVien() {
        if (this.danhSach.size() == 0) {
            System.out.println("Khong co sinh vien nao trong danh sach");
        } else {

            for (SinhVien sinhVien : danhSach) {
                System.out.println(sinhVien);
            }
        }
    }

    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(SinhVien sinhVien) {
        return this.danhSach.contains(sinhVien);
    }

    public boolean xoaSinhVien(SinhVien sinhVien) {
        if (this.kiemTraTonTai(sinhVien) == true) {
            return this.danhSach.remove(sinhVien);
        } else {
            return false;
        }
    }

    public void timSinhVien(String hoVaTen) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(hoVaTen) >= 0) {
                System.out.println(sinhVien);
            } else {
                System.out.println("Khong tim thay");
            }
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;
                }
                else if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return 1;
                }
                else{
                    return 0;
                }
            }

        });
    }

}
