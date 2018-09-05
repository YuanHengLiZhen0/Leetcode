package leetcode.linkedlist;

import book.ListNode;
import tool.MyUtil;

import java.util.HashSet;

public class 无序链表删除重复 {

    public  static  void main(String[]args){
        ListNode t1=new ListNode(1);
        ListNode t2=new ListNode(2);
        ListNode t3=new ListNode(3);
        ListNode t4=new ListNode(3);
        ListNode t5=new ListNode(4);
        ListNode t6=new ListNode(4);
        ListNode t7=new ListNode(2);
        ListNode t8=new ListNode(1);
        ListNode t9=new ListNode(1);
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        t5.next=t6;
        t6.next=t7;
        t7.next=t8;
        t8.next=t9;

       f(t1);
        MyUtil.print(t1);
    }

    public static  ListNode f(ListNode head){
        if(head==null||head.next==null)return head;
        HashSet<Integer> set=new HashSet<>();
        set.add(head.label);
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
           if(set.contains(cur.label)){
               pre.next=cur.next;
               cur=pre.next;
           }else {
               set.add(cur.label);
               pre=pre.next;
               cur=cur.next;
           }

        }
        return  head;
    }

}
