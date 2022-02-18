
public class App {
    public static void main(String[] args){
       
        Point point = new Point(1, 2);
        point.printMsg();

        MyDate date = new MyDate(30, 8, 2001);
        date.printDay();
        date.printYear();
        date.printMonth();
        date.printDate();
    }
}
