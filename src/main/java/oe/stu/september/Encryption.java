package oe.stu.september;

import javax.management.monitor.StringMonitor;
import java.util.Scanner;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/9/25.
 */
public class Encryption {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入英文字符串或解密字符串");
        String password = scanner.nextLine();
        char[] array = password.toCharArray();
        for (int i = 0;i<array.length;i++){
            array[i] = (char)(array[i]^20000);
        }
        System.out.println(new String(array));
    }
}
