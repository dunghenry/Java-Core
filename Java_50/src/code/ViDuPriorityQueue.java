package code;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
    public static void main(String[] args) {
        Queue<String> dssv = new PriorityQueue<String>();

        dssv.offer("DungHenry");
        dssv.offer("TranDung");
        dssv.offer("DungTran");
        dssv.offer("TranVanDung");

        for (String name : dssv) {
            System.out.println(name.toUpperCase());
        }

        System.out.println("---------------------------------");

        while (true) {
            String ten = dssv.poll(); // Lay ra va xoa
            if (ten == null) {
                break;
            }
            // peek => Lay ra nhung khong xoa
            System.out.println(ten);
        }

        System.out.println("---------------------------------");

        for (String name : dssv) {
            System.out.println(name);
        }

    }
}
