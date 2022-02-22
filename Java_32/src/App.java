public class App {
    public static void main(String[] args) throws Exception {
        ToaDo td1 = new ToaDo(5, 5);
        ToaDo td2 = new ToaDo(7, 9);
        ToaDo td3 = new ToaDo(12, 1);
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2, 4);
        Hinh h3 = new HinhChuNhat(td1, 6, 4);
        System.out.println("Dien tich hinh tron la: " + h2.tinhDienTich());
        System.out.println("Dien tich hinh chu nhat la: " + h3.tinhDienTich());
    }
}
