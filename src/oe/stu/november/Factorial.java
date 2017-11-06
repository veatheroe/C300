package oe.stu.november;

import java.math.BigDecimal;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2017/11/5.
 */
public class Factorial {
    public static void main(String[] args){
        BigDecimal sum = new BigDecimal(0.00);
        BigDecimal factorial = new BigDecimal(1.0);
        System.out.println(sum);
        int i = 1;
        while(i<11){
            sum = sum.add(factorial);
            i++;
            factorial = factorial.multiply(new BigDecimal(1.0/i));
        }
        System.out.println(sum);
    }
}
