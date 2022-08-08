package com.zheng.for4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: ZhengTianLiang
 * @date: 2022/08/08 22:40
 * @desc: 寻找两个正序数组的中位数
 */
public class MyTry {

    public static void main(String[] args) {
        int [] a = new int[]{1,3};
        int [] b = new int[]{2};
        double medianSortedArrays = findMedianSortedArrays(a,b);
        System.out.println(medianSortedArrays);
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        // 1、把俩数组合并
        ArrayList list1 = new ArrayList(Arrays.asList(nums1));
        ArrayList list2 = new ArrayList(Arrays.asList(nums2));
        list1.addAll(list2);
        // 2、排序
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }); // 默认是升序排列
        // 3、拿到中位数
        if (list1.size() >= 1 ){
            if (list1.size() % 2 == 1){
                result = Double.valueOf(list1.get(list1.size()/2).toString());
            }else {
                int a = (int)list1.get(list1.size() / 2);
                int b = (int)list1.get(list1.size() / 2 -1);
                result = (a+b)/2.0;
            }
        }
        return result;
    }
}
