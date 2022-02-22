public class App {
    public static void main(String[] args) throws Exception {
        HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
		HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hãng 3", "Nhật Bản");
		
		PhuongTienDiChuyen p1 = new XeOTo("Xe Oto",h1, "Trường Hải");
		MayBay p2 = new MayBay("May bay", h2, "Xăng");
		PhuongTienDiChuyen p3 = new XeDap("Xe dap", h3);
		
		System.out.println("Lay hang san xuat");
		System.out.println("p1: "+ p1.layTenHangSanXuat());
		
		System.out.println("Bat dau: ");
		p2.batDau();
		
		System.out.println("Lay van toc: ");
		System.out.println("p1: "+ p1.layVanToc());
		System.out.println("p2: "+ p2.layVanToc());
		System.out.println("p3: "+ p3.layVanToc());
		
		
		System.out.println("Cat canh: ");
		p2.catCanh();
    }
}
