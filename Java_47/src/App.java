import code.Ngay;
import code.ThoiKhoaBieu;

public class App {
    public static void main(String[] args) throws Exception {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Ngay.Monday, "Toan , Ly , Hoa");
        System.out.println(tkb_t2.getThu());
        System.out.println(tkb_t2.toString());
    }
}
