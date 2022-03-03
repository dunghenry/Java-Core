package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSach = new PriorityQueue<String>();
        //Tu dong sap xep
        danhSach.offer("DungHenry");
        danhSach.offer("A");
        danhSach.offer("Dung2k1");
        danhSach.offer("DungTran");
        while (true) {
            String name = danhSach.poll();
            if(name == null) {
                break;
            }
            System.out.println(name);
        }
    }

}
