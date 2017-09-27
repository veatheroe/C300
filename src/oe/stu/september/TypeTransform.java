package oe.stu.september;

/**
 * @Author： oe
 * @Description:transform lower type to higher type
 * byte to short int long float double
 * long to float double
 * char to int long float double
 * @Created by oe on 2017/9/25.
 */
public class TypeTransform {
    public static void main(String[] args){
        byte b = 50;
        char c = 'G';
        short s = 12345;
        int i = 6789;
        long l = 1000L;
        float f = 3.14159F;
        double d = 3.1415926;
        System.out.println(b+c);
        System.out.println(b+c+s);
        System.out.println(b+c+s+i);
        System.out.println(b+c+s+i+l);
        System.out.println(b+c+s+i+f);
        System.out.println((int)d);
        int ab = 123;
        int nb = 321;
        ab = ab^nb;
        nb = nb^ab;
        ab = ab^nb;
        System.out.println(ab+""+""+nb);
    }
}
