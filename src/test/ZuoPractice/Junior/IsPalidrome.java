package test.ZuoPractice.Junior;

import java.util.Stack;

/**
 * @author SGN196
 * @date 2018/12/24 22:47
 */

public class IsPalidrome {

    class Node{
        Integer value;
        Node next;
        public Node(Integer data){
            this.value = data;
        }
    }

    /**
     * 需要N的额外空间
     * @param head
     * @return
     */

    public static boolean isPalindrome1(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Stack<Node> stack = new Stack<Node>();
        Node cur = head;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            if(cur.value != stack.pop().value){
                return false;
            }
        }
        return true;
    }

    /**
     * N/2的额外空间
     */
    public static boolean isPalindrome2(Node head){

        Stack<Node> stack = new Stack<Node>();
        Node cur1 = head;
        Node cur2 = head;
        while(cur2.next != null && cur2.next.next != null){
            stack.push(cur1);
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
        if(cur2.next != null)
            cur1 = cur1.next;
        cur1 = cur1.next;
        while(cur1 != null){
            if(cur1.value != stack.pop().value){
                return false;
            }
        }
        return true;
    }

    /**
     * O(1)的额外空间

     */
    public static boolean isPalindrome3(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node n1 = head;
        Node n2 = head;
        while(n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        while(n2 != null){
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }


        return true;
    }

    public static void main(String[] args) {
//        Test01.Node a1 = new Test01().new Node(1);

    }
}
