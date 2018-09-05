package book;

public class 复杂链表复制 {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null)
            return null;
        RandomListNode p = pHead;
        //复制next 如原来是A->B->C 变成A->A'->B->B'->C->C'
        while(p!=null){
            RandomListNode node = new RandomListNode(p.label);
            node.next = p.next;
            p.next = node;
            p = p.next.next;
        }
        p = pHead;
        //复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
        while(p!=null){
            if(p.random!=null)
                p.next.random = p.random.next;
            p = p.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        p = pHead;
        //拆分链表
        while(p!=null){
            p.next = p.next.next;
            if(cur.next!=null)
                cur.next = cur.next.next;
            cur = cur.next;
            p = p.next;
        }
        return head;
    }


     class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;
        RandomListNode(int label) {
            this.label = label;
        }
    }
}
