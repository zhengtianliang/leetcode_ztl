package com.zheng.for3;

import com.jayway.jsonpath.internal.function.numeric.Max;

import java.util.*;

/**
 * @author: ZhengTianLiang
 * @date: 2022/05/23 23:40
 * @desc: leetcode第3题：无重复字符最长子串    标准答案
 *
 *  todo:应该左侧指针固定，移动右侧指针，当窗口内最右侧的字符在set中存在时，
 *      左侧指针移动并从set中移除原左侧指针对应的字符，这样再取窗口长度的最大值即可
 */
public class StandardPojo {
    public static void main(String[] args) {
        String s = "dsdadddsd";
        System.out.println(maxLengthMethod(s));
    }

    public static Integer maxLengthMethod(String s){
        Set<Character> set = new HashSet<>();
        Integer left = 0;
        Integer right = 0;
        Integer max = 0;
        for (;right<s.length();right++){
            char ch = s.charAt(right);
            while (set.contains(ch)){ // 重复的话，
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch); // 不存在的话，添加到set中去
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
