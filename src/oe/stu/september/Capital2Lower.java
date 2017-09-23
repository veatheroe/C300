package oe.stu.september;

import sun.applet.Main;

import java.util.Scanner;

/**
 * @Author： oe
 * @Description: Created by oe on 2017/9/23.
 */
public class Capital2Lower {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要进行转换的字母:");
        char c = in.next().charAt(0);
        if(c>='A' && c<'Z'){
            c +=32;
            System.out.println("大写字母"+(char)(c-32)+"被转换成了"+(char)c);
        }
    }
}
