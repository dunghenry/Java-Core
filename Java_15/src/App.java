public class App {
    public static void main(String[] args) throws Exception {
        int out, in = 0;
        for (out = 0; out < 10; out++ ){
        for(in = 0; in < 20; in++ ){
        if(in > 10)
        break;
        }
        System.out.println("Ben trong vong lap out: out = " + out + " in = " + in);
        }
        System.out.println("Ben ngoai vong lap out: out = " + out + " in = " + in);
    }
}
