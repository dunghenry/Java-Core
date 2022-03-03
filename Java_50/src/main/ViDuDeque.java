package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {
    public static void main(String[] args) {
        Deque<String> dssv = new ArrayDeque<String>();
        dssv.offer("DungHenry");
        dssv.offer("TranDung");
        dssv.offer("DungTran");
        dssv.offer("TranVanDung");
        dssv.offerFirst("First");
        dssv.offerLast("Last");

        System.out.println(dssv.peekFirst());
        System.out.println("----------------------");
        while (true) {
            String name = dssv.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }
    }
}
