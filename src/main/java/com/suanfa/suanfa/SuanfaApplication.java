package com.suanfa.suanfa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SuanfaApplication {

    public static void main(String[] args) {

        SpringApplication.run(SuanfaApplication.class, args);























       /* ListCompare(new int[] {1,3,4},5);*/
        minRemoveToMakeValid("lee(t(c)o)de)");
    }

    /*
        两个数组内的数据对比类型
     */
    //1.输出类型
    public static void  ListCompare(int[] target, int n) {
        //创建String的数组
        //创建两个数组，为每个数组设置指针。
        List<String> returnString = new ArrayList<String>();

        int targetPoint = 1;
        int listPoint = 1;
        //判断targetPoint数组数据是否等于list的数组,因为list是严格1到n的所以listPoint的指针+1一定等于数组位的值
        while (targetPoint <= target.length&&targetPoint<=n) {
            if (target[targetPoint-1] == listPoint) {
                returnString.add("push");
                //target目标数组右移一位
                targetPoint = targetPoint+1;
                //list对比数组也右移一位
                listPoint = listPoint + 1;
            } else if (target[targetPoint-1] > listPoint) {
                returnString.add("push");
                returnString.add("pop");
                //list 对比数组右移动一位
                listPoint = listPoint + 1;
            }
        }
        System.out.println(returnString);
    }

    //判断string中的括号（）删除不对等的，让（）括号为整对的

    public static void  minRemoveToMakeValid(String s) {


         int right=0;
         int left=0;
        //遍历chars
        for(int i=0;i<s.length();i++){

            //判断是否等于"("或者”)“
            if(s.charAt(i)=='('){

                right=right+1;

            }else if (s.charAt(i)==')'){
                left=left+1;
            }

        }
        if(right>left){
            int n=right-left;
            while (n>0){
               s= s.replaceFirst("\\(","");
               n--;

            }
        }else if(left>right){
            int n=left-right;
            while (n>0){
                s= s.replaceFirst("\\)","");
                n--;
            }
        }
        System.out.println(s);
    }

    //找出不重复的字符串
    class Solution {
        public int lengthOfLongestSubstring(String s) {
        return 1;
        }
    }

}
