
public class HocSinh extends ConNguoi {
    private String tenTruong;
    private String tenLop;

    public HocSinh(String hoVaTen, int namSinh, String tenTruong, String tenLop){
        super(hoVaTen, namSinh);
        this.tenTruong = tenTruong;
        this.tenLop = tenLop;
    }

    public String getTenTruong(){
        return tenTruong;
    }
    public void setTenTruong(String tenTruong){
        this.tenTruong = tenTruong;
    }

    public String getTenLop(){
        return tenLop;
    }

    public void setTenLop(String tenLop){
        this.tenLop = tenLop;
    }

    public void lamBaiTap(){
        System.out.println("Lam bai tap ve nha");
    }
}
