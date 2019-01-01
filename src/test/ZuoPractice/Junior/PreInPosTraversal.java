package test.ZuoPractice.Junior;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/26 15:28
 * 使用递归和一般函数，实现树的前序、中序、后序遍历
 */

public class PreInPosTraversal {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int data){
            this.value = data;
        }
    }
    public static void preOrderRecur(Node head){
        if(head == null)
            return;
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    public static void preOrderUnRecur(Node head){
        if(head == null)
            return ;
        Stack<Node> stack = new Stack<Node>();
        stack.add(head);
        while(!stack.isEmpty()){
            head = stack.pop();
            System.out.print(head.value + " ");
            if(head.right != null){
                stack.add(head.right);
            }
            if(head.left != null){
                stack.add(head.left);
            }
        }

    }
    public static void inOrderRecur(Node head){
        if(head == null)
            return;
        inOrderUnRecur(head.left);
        System.out.print(head.value + " ");
        inOrderUnRecur(head.right);
    }
    public static void inOrderUnRecur(Node head){
        if(head == null)
            return;
        Stack<Node> stack = new Stack<Node>();
        while(!stack.isEmpty() || head != null){
            if(head != null){
                stack.push(head);
                head = head.left;
            }else{
                head = stack.pop();
                System.out.print(head.value + " ");
                head = head.right;
            }
        }
    }
    public static void posOrderRecur(Node head){
        if(head == null){
            return ;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.value + " " );
    }
    public static void posOrderUnRecur1(Node head){
        if(head == null){
            return ;
        }
        Stack<Node> stack = new Stack<Node>();
        Stack<Node> result = new Stack<Node>();
        stack.push(head);
        while(!stack.isEmpty()){
            head = stack.pop();
            result.push(head);
            if(head.left != null)
                stack.push(head.left);
            if(head.right != null){
                stack.push(head.right);
            }


        }
        while(!result.isEmpty()){
            System.out.print(result.pop().value + " ");
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(8);
        head.left.left = new Node(2);
        head.left.right = new Node(4);
        head.left.left.left = new Node(1);
        head.right.left = new Node(7);
        head.right.left.left = new Node(6);
        head.right.right = new Node(10);
        head.right.right.left = new Node(9);
        head.right.right.right = new Node(11);

//        preOrderRecur(head);
//        System.out.println();
//        preOrderUnRecur(head);

//        inOrderRecur(head);
//        System.out.println();
//        inOrderUnRecur(head);
        posOrderRecur(head);
        System.out.println();
        posOrderUnRecur1(head);


    }
}
