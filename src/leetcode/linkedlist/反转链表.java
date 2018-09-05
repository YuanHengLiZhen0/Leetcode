package leetcode.linkedlist;

import book.ListNode;
import tool.MyUtil;

public class 反转链表 {

    public static void main(String[]rags){
        ListNode t1=new ListNode(0);
        ListNode t2=new ListNode(1);
        ListNode t3=new ListNode(2);
        ListNode t4=new ListNode(3);
        t1.next=t2;
        ReverseList(t1);
    }

    public static ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = head;
        ListNode pre = newHead;
        while (p != null) {
            ListNode q = p.next;
            if(q==null)break;
            p.next=q.next;
            q.next=pre.next;
            pre.next=q;
            MyUtil.print(newHead);
        }
        return newHead.next;
    }


}