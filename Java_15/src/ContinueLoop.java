public class ContinueLoop {
    public static void main(String[] args) {
        int max = 100;
        for (int out = 0; out < 50; out++) {
            for (int i = 0; i < max; i++) {
                if (i < 50)
                    continue;
                System.out.println(i);
            }
        }
        System.out.println("Ket thuc");

    }
}
