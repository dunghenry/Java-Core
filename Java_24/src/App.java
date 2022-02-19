public class App {
    public static void main(String[] args) throws Exception {
        Ngay ngay = new Ngay(20, 10, 2001);
        HangSanXuat hangSanXuat = new HangSanXuat("DTHVN", "VietNam");
        BoPhim bp = new BoPhim("Oke", 2001, hangSanXuat, 10, ngay);
        System.out.println(bp.getNamSanXuat());
        System.out.println(bp.layTenHangSanXuatPhim());
        System.out.println(bp.giaSauKhuyenMai(10));
    }
}
