package ThinkingInJava.test.test12_25;

import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @author SGN196
 * @date 2018/12/25 16:18
 */

public class ListWithRand {
    static class Node{
        Integer value;
        Node next;
        Node rand;
        public Node(Integer data){
            this.value = data;
        }
    }
    public static Node copyListWithRand1(Node head){
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node cur = head;
        while(cur != null){
            map.put(cur, new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }
    public static Node MyCopy(Node head){
        Node cur = head;
        Node head1 = null;
        while(cur != null){
            if(head1 == null){
                head1 = new Node(head.value);
            }else{

            }
        }
        return null;

    }

    public static Node copyListWithRand2(Node head){
        Node cur = head;
        while(cur != null){
            Node tmp = new Node(cur.value);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = cur.next.next;
        }
        cur = head;
        while(cur != null){
            cur.next.rand = cur.rand.next;
            cur = cur.next.next;
        }
        Node head2 = head.next;
        Node cur2 = head.next;
        cur = head;
        while(cur != null){
            cur.next = cur2.next;
            cur2.next = cur2.next.next;
        }
        return head2;



    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
    }

}
