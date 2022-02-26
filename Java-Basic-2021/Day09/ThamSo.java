
public class ThamSo {
    public static void main(String[] args) {
        int a = 2, b = 3;
       System.out.println("TBC: " + TBC(a, b));
       Check(a);
    }
    static float TBC(int a, int b){
        return (float)(a + b) / 2;
    }
    static void Check(int a){
        if(a > 20){
            System.out.println("Lon hon 20");
        }
        else{
            System.out.println("Nho hon 20");
        }
    }
}
