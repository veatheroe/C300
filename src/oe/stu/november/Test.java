package oe.stu.november;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/11/21.
 */
public class Test {
    public static void main(String args[]){
        Singleton st = Singleton.st;
        Singleton  singleton = Singleton.st;
        System.out.println(st + "   "+ singleton);
    }
}
