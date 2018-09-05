package leetcode.linkedlist;

import book.ListNode;

public class 链表的循环起点 {
    /*
    * author:zwht
    * 假设循环长为b，起点到循环长a；slow每次一个节点，fast每次两个节点
    * 则达到slow循环起点时，fast是一个同向追逐问题，需要经过(b-a)时间方能追上slow.
    * 此时fast总共走了2b。故此时离循环点还差a;
    *
    *
    * */

    public ListNode f(ListNode head){
        if(head==null||head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(slow==fast){
                 fast=head;
                 while(fast!=slow){
                     fast=fast.next;
                     slow=slow.next;
                 }
                 return slow;
             }
        }
        return  null;
    }
}
