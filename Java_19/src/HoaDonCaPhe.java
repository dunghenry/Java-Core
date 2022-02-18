public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien;
    private double khoiLuong;

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien = giaTien;
        this.khoiLuong = khoiLuong;
    }

    public double tinhTongTien() {
        double tongTien = this.giaTien * this.khoiLuong;
        return tongTien;
    }

    public void printCaPhe() {
        System.out.println(
                "Ten ca phe :" + tenLoaiCaPhe + " , " + "Khoi luong : " + khoiLuong + " , " + "Gia tien : " + giaTien);
    }

    public boolean checkKhoiLuong(double kl) {
        return this.khoiLuong > kl;
    }

    public boolean checkTongTien(){
        return this.tinhTongTien() > 500000;
    }

    public double giamGia(double x){
        if(this.tinhTongTien() > 500000){
            return (x / 100) * this.tinhTongTien();
        }
        else{
            return 0;
        }
            
    }

    public double tongTien(double x){
        return this.tinhTongTien() - giamGia(x);
    }
}
