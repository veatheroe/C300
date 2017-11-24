package oe.stu.november;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/11/23.
 */
public class AnonymousApp {
    Thread t1 = new Thread(new Runnable() {
        @Override
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
    });
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("Hallo "+ i+"time:" + System.currentTimeMillis());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
    }
}
