public class App {
    public static void main(String[] args) throws Exception {
        Ngay ngay = new Ngay(30, 8, 2001);
        TacGia tacGia = new TacGia("DungHenry", ngay);

        Sach sach1 = new Sach("Learn Java", 10000, 2010, tacGia);
        Sach sach2 = new Sach("Learn C++", 10000, 2010, tacGia);
        
        // sach1.inTenSach();
        System.out.println(sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println(sach1.giaSauKhiGiam(10));
    }
}
