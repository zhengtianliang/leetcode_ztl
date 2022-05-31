package com.zheng.for3;

/**
 * @author: ZhengTianLiang
 * @date: 2022/05/23 23:26
 * @desc: leetcode第3题：无重复字符最长子串
 *      todo：1思路，定义一个空字符串，当最长的，将第一个字符，遍历，不重复的话，就是最长的；
 *          然后第一个第二个字符的整体，去看字符串存在不，不存在，就是最长的，最终遍历完，输出
 *      todo:1思路：将第一个字符拿出来，看剩下的字符串中是否还有这个字符了，然后循环遍历。
 *              abcabcbb   以她为例子就是    a 索引0   索引3 他俩之间的就是abc看字符串是否存在，
 */
public class MyTry {
    public static void main(String[] args) {
        // 要被处理的串儿
        String source = "abcabcbb";
        // 默认的结果
        String target = "";
        for (int i=0;i<source.length();i++){
            char c = source.charAt(i);
            target = String.valueOf(c);
            String[] split = source.split(String.valueOf(c));
            for (int j=0;j<source.length();j++){

            }
        }

    }


    /**
     * @author: ZhengTianLiang
     * @date: 2022/02/14  18:10
     * @desc: 写一个递归，用来返回结果
     */
     public String recursion(int index,String s){
        return "";
     }
}
