package oe.stu.november;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @Author： oe
 * @Description:单例模式与静态工厂方法
 * @Created by oe on 2017/11/21.
 */
public class Singleton {
    public static final Singleton st = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return st;
    }

}
