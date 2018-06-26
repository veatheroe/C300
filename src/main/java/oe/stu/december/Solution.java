package oe.stu.december;

/**
 * @Author： oe
 * @Description:在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 问题本身很简单，关键的坑在于对数组中的数组的长度的处理，即如果数组中有一个空数组，要检测出来，以防止
 * 抛出空指针异常
 * @Created by oe on 2017/12/15.
 */
public class Solution {
    public static boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            if(array[i][0]>target)
                break;
            for(int j=0;j<array[i].length;j++)
                if(array[i][j] == target)
                    return true;
        }
        return false;
    }

    public static void main(String[] args){

        int[][] data = {{}};
        Find(1,data);
    }
}
