package oe.stu.march;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/3/29.
 */
public class Answer {
    public static void main(String[] args){
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(bf.readLine());
            int [] array = new int[len];
            for(int i=0 ;i < len; i++)
                array[i] = Integer.parseInt(bf.readLine());
            if (len == 0) {
                return;
            }
            int zeroNum = 0;
            int temp = 0;
            boolean hasZero = false;
            for (int i = 0; i < len-zeroNum; i++) {
                temp = i;
                if (array[i] == 0) {
                    for (int j = i + 1; j < len - zeroNum; j++) {
                        if (i+1 == 0 && !hasZero) {
                            hasZero = true;
                            i--;
                        }
                        array[j - 1] = array[j];
                    }
                    array[array.length - 1 - zeroNum] = 0;
                    zeroNum++;
                }
            }
            for(int i = 0; i<len ;i++)
                System.out.println(array[i]);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
