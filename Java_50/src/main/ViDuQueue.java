package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSach = new LinkedList<String>();
        danhSach.offer("DungHenry");
        danhSach.offer("Dung2k1");
        danhSach.offer("DungTran");

        while(true){
            String name = danhSach.poll();
            // Lay ra va xoa
            //peek Lay ra khong xoa
            if(name == null){
                break;
            }
            System.out.println(name);
        }
    }
}
