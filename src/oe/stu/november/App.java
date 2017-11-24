package oe.stu.november;

import java.util.Scanner;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/11/23.
 */
class Runner extends Thread {

    private volatile boolean running = true;
    public void run() {
        while(running){
            System.out.println("Hello ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}
public class App {

    public static void main(String[] args){
        Runner runner1 = new Runner();
        runner1.start();
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        runner1.shutdown();
    }
}
