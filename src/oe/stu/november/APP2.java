package oe.stu.november;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/11/23.
 */
class runner implements Runnable{
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Hello "+ i+"time:" + System.currentTimeMillis());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class APP2 {
    public static void main(String[] args){
        Thread t1 = new Thread(new runner());
        Thread t2 = new Thread(new runner());
        t1.start();
        t2.start();
    }
}
