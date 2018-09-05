package leetcode.linkedlist;

import book.ListNode;
import book.RandomListNode;

public class DeepCopy {
    public static RandomListNode deep(RandomListNode head){
        if(head==null) return head;
        RandomListNode p=head;
        //1-2-3  变成  1-1-2-2-3-3
        // 分解
        while(p!=null){
            RandomListNode tmp=new RandomListNode(p.label);
            tmp.random=p.random;
            tmp.next=p.next;
            p.next=tmp;
            p=tmp.next;
        }

        p=head.next;
        while (p!=null&&p.next!=null){
            RandomListNode tmp=p.next.next;
            p.next=tmp;
            if(p.random!=null)
                p.random=p.random.next;
            p=tmp;
        }
        return  head.next;
    }
}
