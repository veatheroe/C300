package oe.stu.september;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/12/5.
 */
public class Veatheroe {
    public static void main(String[] args){
        Thread t1 = new Thread(new Tuna("one"));
        Thread t2 = new Thread(new Tuna("two"));
        Thread t3 = new Thread(new Tuna("three"));
        Thread t4 = new Thread(new Tuna("four"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
