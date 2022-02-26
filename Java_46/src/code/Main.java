package code;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++){
            System.out.println(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Thoi gian bat dau chay vong lap for: " + t1);
        System.out.println("Thoi gian sau khi chay vong lap for: " + t2);
        System.out.println("Thoi gian chay vong lap for mat so mls la: " + (t2 - t1));
        System.out.println("Thoi gian chay vong lap for mat so s la: " + (t2 - t1) / 1000);
        
        System.out.println("300 nam =  " + TimeUnit.DAYS.toSeconds(300 * 365) + " s ");
        System.out.println("2h = " + TimeUnit.HOURS.toSeconds(2) + " s ");
        System.out.println(2 * 60 * 60);

        Date date = new Date(System.currentTimeMillis());
        System.out.println(date.getYear() + 1900 + "-" + (date.getMonth() + 1) + "-" + date.getDate());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        cal.add(Calendar.HOUR, 20);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        cal.add(Calendar.DATE, 14);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));

        DateFormat df = new SimpleDateFormat();
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));

    }
}
