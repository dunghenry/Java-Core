
public class Functions {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("Tong la: " + Tong(x, y));
        System.out.println("Hieu la: " + Hieu());
        Hello();
        int r = 2;
        System.out.println("Chu vi hinh tron la: " + ChuVi(r));
    }

    public static int Tong(int x, int y){
        return x + y;
    }

    public static int Hieu(){
        int x = 10, y = 20;
        return x - y;
    }

    public static void Hello(){
        System.out.println("Hello world");
    }

    public static float PI(){
        return 3.14f;
    }
    public static float ChuVi(int r){
        return 2*r*PI();
    }
}
