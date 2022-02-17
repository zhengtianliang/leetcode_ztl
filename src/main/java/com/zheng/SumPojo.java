package com.zheng;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ZhengTianLiang
 * @date: 2022/02/14  18:10
 * @desc: leetcode第一题，两数之和，圆满通过
 */
public class SumPojo {
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result.add(i);
                    result.add(j);
                    i = j;
                    break;
                }
            }
        }
        int [] c = result.stream().mapToInt(Integer::intValue).toArray();
        return c;
    }


    public static void main(String[] args) {
        int [] a = {3,2,4};
        int[] ints = twoSum(a, 6);
        System.out.println(123);
    }
}
