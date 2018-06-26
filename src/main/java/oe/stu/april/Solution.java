package oe.stu.april;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/5/9.
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int zu = sc.nextInt();
        int ruleNum = sc.nextInt();
        int[][] rules = new int[ruleNum][2];
        for(int i=0;i<ruleNum;i++){
            String[] ruleString = sc.nextLine().split(" ");
            rules[i][0] = Integer.parseInt(ruleString[0]);
            rules[i][1] = Integer.parseInt(ruleString[1]);
        }
        int [] f = new int[zu];
//        ArrayList
//        for()

    }
    public boolean panduan(int [][] rules, int currentIndex){
        return false;
    }





}
