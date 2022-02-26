public class FunctionJava {
    public static int tongHaiSo(int a, int b) {
        return a + b;
    }

    public static int hieuHaiSo() {
        int a = 10;
        int b = 20;
        return b - a;
    }

    public static void xinChao() {
        System.out.println("Xin chao cac ban!!!");
    }

    public static float soPi() {
        return 3.14f;
    }
    public static void main(String[] args) {
        xinChao();
        System.out.println("Tong hai so: " + tongHaiSo(2, 3));
        System.out.println("Hieu hai so la: " + hieuHaiSo());
        System.out.println("So Pi la: " + soPi());
        int r = 3;
        float chuViHinhTron = soPi() * r;
        System.out.println("Chu vi hinh tron la: " + chuViHinhTron);
    }
}
