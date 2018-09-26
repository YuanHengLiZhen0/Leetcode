package book;

import java.util.Stack;

public class 非递归先序中序 {

    public static void preOreder(Node head){
        if(head==null)return ;
        Stack<Node> stack=new Stack();
        while(head!=null||!stack.isEmpty()){
            while(head!=null){
                System.out.println(head.value);
                stack.push(head);
                head=head.left;
            }
            Node node=stack.pop();
            head=node.right;
        }

    }

    public static void inOreder(Node head){
        if(head==null)return ;
        Stack<Node> stack=new Stack();
        while(head!=null||!stack.isEmpty()) {
            while (head != null) {
                stack.push(head);
                head = head.left;
            }
            Node node = stack.pop();
            System.out.println(node.value);
            head=node.right;

        }

    }
    static class Node{
        Node left;
        Node right;
        int value;
    }
}
