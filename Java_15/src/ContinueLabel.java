public class ContinueLabel{
    public static void main(String[] args) {
        loop: for (int  i = 2; i <= 9; i++){
            System.out.println("Bang cuu chuong " + i);
            for (int j = 1; j <= 10; j++){
                if(j > 6)
                    continue loop;
                System.out.println( i + " x " + j + " = " + i * j);
            }
        }
    }
}