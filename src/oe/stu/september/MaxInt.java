package oe.stu.september;

/**
 * Created by oe on 2017/9/23.
 * @author oe
 * @Description: get the max int/double value
 */

public class MaxInt {
    public static int method1(){
        return Integer.MAX_VALUE;
    }
    public static double getMaxDouble(){
        return Double.MAX_VALUE;
    }
    public static void main(String[] args){
        System.out.println(MaxInt.method1());
        System.out.println(MaxInt.getMaxDouble());
    }
}
