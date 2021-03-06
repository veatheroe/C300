package oe.stu.september;

import java.util.Random;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/12/5.
 */
public class Tuna implements Runnable {

    private String name;
    int time;
    Random r = new Random();

    public Tuna (String x){
        name = x;
        time = r.nextInt(999);
    }

    public void run(){
        try{
            System.out.printf("%s us sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }catch (Exception e){}
    }
}
