package oe.stu.april;

import java.util.Scanner;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/4/12.
 */
public class Answer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fstLine = sc.nextLine();
        int chairNum = Integer.parseInt(fstLine.split(" ")[0]);
        int opNum = Integer.parseInt(fstLine.split(" ")[1]);
        int[][]  ops = new int[opNum][2];
        int[]  chairQue = new int[chairNum];
        int[] printQue = new int[opNum];
        int min = 9999;
        for(int i=0;i< opNum;i++) {
            fstLine = sc.nextLine();
            int op = Integer.parseInt(fstLine.split(" ")[0]);
            int people = Integer.parseInt(fstLine.split(" ")[1]);
            if (op == 1) {
                int sit = 0;
                int juli = 0;

                for (int j = 0; j < chairNum; j++) {
                    if (chairQue[j] != 0)
                        continue;
                    int firstSetted = 0;
                    int tempJuli = 0;
                    int termpMin = 9999;
                    for (int k = 0; k < chairNum; k++) {
                        if (chairQue[k] != 0) {
                            tempJuli += Math.abs(j - k);
                            if(Math.abs(j - k) <= termpMin)
                                termpMin = Math.abs(j - k);
                        }
                    }
                    if(tempJuli>juli){
                        juli = tempJuli;
                        min = termpMin;
                        sit = j;
                    }else if(tempJuli == juli){
                        if(min< termpMin) {
                            min = termpMin;
                            sit = j;
                        }else if(min == termpMin){
                            if(j < sit)
                                sit = j;
                        }
                    }
                }
                printQue[i] = sit + 1;
                chairQue[sit] = people;
            } else if (op == 2) {
                for (int n = 0; n < chairNum; n++)
                    if (chairQue[n] == people) {
                        chairQue[n] = 0;
                    }
            }
        }
        for(int i=0 ; i<opNum;i++)
            if(printQue[i]!=0)
                System.out.println(printQue[i]);
    }
}
