package oe.stu.september;

/**
 * @Author： oe
 * @Description:工作薪水问题，每天薪水分两种，轻活薪水，重活薪水，重活薪水只能在
 * 前一天不干活的情况下才能拿；问给定薪水列表和工作天数后，怎样工作是薪水最高的
 * @Created by oe on 2017/9/27.
 */
public class Solution {

    public int maxStipend(int numOfDays, int[][] taskList) {
        int[][] maxPay = new int[100000][3];
        for (int i = 0; i < 100000; i++)
            for (int j = 0; j < 3; j++)
                maxPay[i][j] = -1;
        maxPay[0][0] = 0;
        maxPay[0][1] = taskList[0][0];
        maxPay[0][2] = 0;
        for (int i = 1; i < numOfDays; i++) {
            if (maxPay[i - 1][1] > maxPay[i - 1][2])
                maxPay[i][0] = maxPay[i - 1][1];
            else
                maxPay[i][0] = maxPay[i - 1][2];
            if (maxPay[i - 1][1] > maxPay[i - 1][2])
                maxPay[i][1] = maxPay[i - 1][1] + taskList[i][0];
            else
                maxPay[i][1] = maxPay[i - 1][1] + taskList[i][0];
            maxPay[i][2] = maxPay[i-1][0] + taskList[i][1];
        }
        return Math.max(Math.max(maxPay[numOfDays-1][0],maxPay[numOfDays-1][1]),maxPay[numOfDays-1][2]);

    }
    public static void main(String[] args){
        int[][] pay = {{1,2},{2,3},{3,10000},{4,5},{5,1}};
        System.out.println(new Solution().maxStipend(5,pay));
    }
}
