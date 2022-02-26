
public class IfElse{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println("a lon hon b");
        }
        else if(a == b){
            System.out.println("a bang b");
        }
        else
            System.out.println("a nho hon b");
        // ! Toán tử ba ngôi
        String text = (a > b) ? "true" : "false";
        System.out.println(text);
    }
}