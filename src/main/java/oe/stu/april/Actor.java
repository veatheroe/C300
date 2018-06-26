package oe.stu.april;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/4/12.
 */
public class Actor implements Runnable {
    @Override
    public void run(){
        int count = 0;
        while(true){
            System.out.println(Thread.currentThread().getName()+"演出场次:"+(++count));
            if(count==100){
                break;
            }
            if(count%10 == 0)
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] line = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(line));
        Thread actor = new Thread(new Actor());
        Thread actress = new Actress();
        actress.start();
        actor.start();
    }
}
class Actress extends Thread{
    @Override
    public void run(){
        setName("actress");
        int count = 0;
        while(true){
            System.out.println(getName()+"演出场次:"+(++count));
            if(count==100){
                break;
            }
            if(count%10 == 0)
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }

        }
    }
}
