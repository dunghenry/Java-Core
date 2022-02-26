package test;

public class App {
    public static void main(String[] args) {
        String str = "Hello world";
        if(str.indexOf(" ") > 0){
            System.out.println(str.indexOf(" ")); //500000
            System.out.println(str.substring(str.lastIndexOf(" ") + 1)); // world

        }
    }
}
