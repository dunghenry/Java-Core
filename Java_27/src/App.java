public class App {
    public static void main(String[] args) throws Exception {
        HocSinh hocsinh = new HocSinh("Dung Henry", 2001, "HAUI", "KTPM02");
        System.out.println(hocsinh.getHoVaTen());
        hocsinh.lamBaiTap();
    }
}
