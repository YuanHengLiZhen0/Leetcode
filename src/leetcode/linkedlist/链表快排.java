package leetcode.linkedlist;

import book.ListNode;
import tool.MyUtil;
/*
* 两个指针，移动的时候通过交换保证p,q之间的都大于选取的值
*
* */
public class 链表快排 {
    public static  void main(String[]rags){
        ListNode t1=new ListNode(8);
        ListNode t2=new ListNode(1);
        ListNode t3=new ListNode(2);
        ListNode t4=new ListNode(8);
        ListNode t5=new ListNode(3);
        ListNode t6=new ListNode(6);
        ListNode t7=new ListNode(3);
        ListNode t8=new ListNode(5);
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        t5.next=t6;
        t6.next=t7;
        t7.next=t8;
        sortList(t1);
        MyUtil.print(t1);

    }

    public static  ListNode sortList(ListNode head) {
    if (head==null)return head;
        quickSort(head,null);
        return  head;
    }

    public static  ListNode quickSort(ListNode head,ListNode end) {
        if (head==null||head==end)return head;
        ListNode q=sort(head,end);
        quickSort(head,q);
        quickSort(q.next,end);
        return  head;
    }
    public static ListNode sort(ListNode head,ListNode Node){
        if(head==null)return head;
        ListNode p=head;
        ListNode q=p;
        while(q!=null&&q!=Node) {
            //找到当前比哨兵小的最后一个值
            while (p!=null&&p != Node && p.label <= head.label) {
                q=p;
                p = p.next;
            }
            p=q;
            q=q.next;
            //从p开始，找到比哨兵小的最开始的值
            while (q!=null&&q != Node && q.label >= head.label) {
                q = q.next;
            }
            if(q!=null&&p!=Node&&q!=Node)
             //交换p和q
            swap(p.next,q);
        }

        swap(head,p);
        return  p;

    }
    public static void swap(ListNode p,ListNode q){
          int tmp=p.label;
          p.label=q.label;
          q.label=tmp;
    }
}
