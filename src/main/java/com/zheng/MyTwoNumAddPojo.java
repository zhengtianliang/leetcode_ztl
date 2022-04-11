package com.zheng;

import java.util.*;

/**
 * @author: ZhengTianLiang
 * @date: 2022/02/14  18:16
 * @desc: leetcode第二题，两数相加。地址：https://leetcode-cn.com/problems/add-two-numbers/
 *      大概思路： 先根据个十百去拆分，然后求和，然后加起来，把数再倒着拆回去。
 */
public class MyTwoNumAddPojo {

    
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//    }

    public static void main(String[] args) {
        List<Map<Integer,Integer>> list = new ArrayList<>();
        int j=0;

        ListNode node1 = new ListNode(1,null);
        ListNode node2 = new ListNode(2,node1);
        ListNode node3 = new ListNode(3,node2);

        int sum1 = 0;
        List<Map<Integer, Integer>> maps1 = sumMethod(node3, 1, list);
        for (Map<Integer, Integer> map : maps1){
            Set<Integer> integers = map.keySet();
            for (Integer i : integers){
                if (i == 1){
                    sum1 += map.get(i);
                    continue;
                }
                sum1 += tenCount(10,i-2)*map.get(i);
            }
        }
        System.out.println(maps1);
        System.out.println(sum1);
    }

    /**
     * @author: ZhengTianLiang
     * @date: 2022/04/4  23:36
     * @desc: 具体实现逻辑的方法
     */
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1、俩数组的第一个元素同时为0的话，直接返回就行了
        if (0 == l1.val && 0 == l2.val){
            return new ListNode(0,null);
        }
        // 2、不同时为0的话，就用数组，倒叙过来，拿到具体的值
        int sum1 = 0;
        int sum2 = 0;
        List<Map<Integer,Integer>> list = new ArrayList<>();
        List<Map<Integer, Integer>> maps1 = sumMethod(l1, 1, list);
        List<Map<Integer, Integer>> maps2 = sumMethod(l2, 1, list);
        for (Map<Integer, Integer> map : maps1){
            Set<Integer> integers = map.keySet();
            for (Integer i : integers){
                if (i == 1){
                    sum1 += map.get(i);
                    continue;
                }
                sum1 += tenCount(10,i-2)*map.get(i);
            }
        }
        System.out.println("sum1的值"+sum1);

        for (Map<Integer, Integer> map : maps1){
            Set<Integer> integers = map.keySet();
            for (Integer i : integers){
                if (i == 1){
                    sum2 += map.get(i);
                    continue;
                }
                sum2 += tenCount(10,i-2)*map.get(i);
            }
        }
        System.out.println("sum2的值"+sum2);
        int sum3 = sum1 + sum1;
        System.out.println("sum3的值"+sum3);

        //分解
//        sum3%10

        // 3、
        return null;
    }

    // 拿到值的方法
    public static List<Map<Integer,Integer>> sumMethod(ListNode node,Integer i,List<Map<Integer,Integer>> list){

        Map<Integer,Integer> map = new HashMap<>();
        if (node.next == null){ // 下个节点是null嘛？
            map.put(i,node.val);
            list.add(map);
            return list;
        }else {
            map.put(i,node.val);
            list.add(map);
            ListNode next = node.next;
            i++;
            sumMethod(next,i,list);
            return list;
        }
    }

    // 拆分的方法
//    public ListNode method(Integer i){
//        i
//    }

    // 拿到10的次幂
    public static  int tenCount(Integer integer,Integer count){
        for (int i=0;i<count;i++){
            integer *= integer;
        }
        return integer;
    }

    // 需要依赖的内部类
    public  static  class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}


