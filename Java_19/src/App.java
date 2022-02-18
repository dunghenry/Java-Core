public class App {
    public static void main(String[] args) throws Exception {
        HoaDonCaPhe caphe = new HoaDonCaPhe("Caphe1", 100000, 10);
        caphe.printCaPhe();
        System.out.println("Tong tien la: " + caphe.tinhTongTien());
        System.out.println("Kiem tra khoi luong lon hon 2 kg : " + caphe.checkKhoiLuong(2));
        System.out.println("Kiem tra khoi luong lon hon 2 kg : " + caphe.checkKhoiLuong(1));
        System.out.println("Kiem tra tong tien lon hon 500000 : " + caphe.checkTongTien());
        System.out.println("So tien duoc giam gia la: " + caphe.giamGia(10));
        System.out.println("So tien phai tra la: " + caphe.tongTien(10));
    }
}
