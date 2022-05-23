package com.zheng;

import java.util.*;

/**
 * @author: ZhengTianLiang
 * @date: 2022/02/14  18:16
 * @desc: leetcode第二题，两数相加。地址：https://leetcode-cn.com/problems/add-two-numbers/
 *      大概思路： 先根据个十百去拆分，然后求和，然后加起来，把数再倒着拆回去。
 */
public class TwoNumAddPojo {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // new一个最前的节点，这个节点不往后移动
        ListNode pre = new ListNode(0);
        // 当前节点，
        ListNode cur = pre;
        // 进位值，默认是0，  就是合大于10的时候，需要进位
        Integer carry = 0;
        // 只要l1、l2有个不为null
        while (l1 != null || l2 != null){
            // 如果是null，则给默认值 0
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            // 计算两数的和,注意，此时多加了一个进位，
            int sum = a + b + carry;

            // 如果大于10，则是1，小于10 是0
            carry = sum / 10;
            // 除以10的余数，  如果是14 则是 4
            int remainder = sum % 10;
            // 当前节点的下一个节点指向 余数
            cur.next = new ListNode(remainder);

            // 将链表往后移
            cur = cur.next;
            // l1、l2也往后移动
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }

        // 如果等于1  需要多加一个进位
        if (carry == 1){
            cur.next = new ListNode(1);
        }

        return pre.next;
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


