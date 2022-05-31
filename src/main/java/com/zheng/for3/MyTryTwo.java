package com.zheng.for3;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ZhengTianLiang
 * @date: 2022/05/23 23:40
 * @desc: leetcode第3题：无重复字符最长子串    尝试2
 */
public class MyTryTwo {
    public static void main(String[] args) {
        String s = "aaaadd";
        Integer integer = recursiveMethod(s);
        System.out.println(integer);
    }

    /**
     * @author: ZhengTianLiang
     * @date: 2022/05/31 22:27
     * @desc: leetcode第3题：无重复字符最长子串    尝试2
     */
    // 递归的方法
    public static Integer recursiveMethod(String s){
        int first = 0;
        int last = 0;
        List<Integer> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            char aChar = chars[i];
            if (s.contains(String.valueOf(aChar))){ // 如果有的话，拿到第一个
                first = s.indexOf(String.valueOf(aChar));
                for (int j=i+1;j<first;j++){
                    recursiveMethod(s.substring(j,first));
                }
            }
            list.add(first);
        }
        return Collections.max(list);
    }

}
