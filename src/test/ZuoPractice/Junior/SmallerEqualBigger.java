package test.ZuoPractice.Junior;

/**
 * @author SGN196
 * @date 2018/12/25 0:02
 * 将链表依据值，划分为小于、等于、大于三个部分，要求实现稳定性，辅助空间O(1)
 */

public class SmallerEqualBigger {
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }
    public static Node listPartioniton1(Node head, int pivot){
        if(head == null){
            return head;
        }
        Node cur = head;
        int i = 0;
        while(cur != null){
            i++;
            cur = cur.next;
        }
        Node[] nodeArr = new Node[i];
        cur = head;
        for (i = 0; i < nodeArr.length; i++) {
            nodeArr[i] = cur;
            cur = cur.next;
        }
        return head;


    }
    public static Node listPartion2(Node head, int pivot){
        Node lessHead = null, equalHead = null, moreHead = null;
        Node lessEnd = null, equalEnd = null, moreEnd = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = null;
            if(head.value < pivot) {
                if (lessHead == null) {
                    lessHead = head;
                    lessEnd = head;
                }
                else{
                    lessEnd.next = head;
                    lessEnd = head;

                }

            }
            else if(head.value > pivot ){
                if( moreHead == null) {
                    moreHead = head;
                    moreEnd = head;
                }else{
                    moreEnd.next = head;
                    moreEnd = head;

                }
            }else{
                if( equalHead == null) {
                    equalHead = head;
                    equalEnd = head;
                }else{
                    equalEnd.next = head;
                    equalEnd = head;

                }
            }
            head = next;

        }

        if(lessEnd != null){
            lessEnd.next = equalHead;
            if(equalEnd == null){
                equalEnd = lessEnd;
            }
        }
        if(equalEnd != null){
            equalEnd.next = moreHead;
        }



       return lessHead != null? lessHead : equalHead != null? equalHead : moreHead;
    }

    public static Node listPartition2(Node head, int pivot) {
        Node sH = null; // small head
        Node sT = null; // small tail
        Node eH = null; // equal head
        Node eT = null; // equal tail
        Node bH = null; // big head
        Node bT = null; // big tail
        Node next = null; // save next node
        // every node distributed to three lists
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.value < pivot) {
                if (sH == null) {
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.value == pivot) {
                if (eH == null) {
                    eH = head;
                    eT = head;
                } else {
                    eT.next = head;
                    eT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                } else {
                    bT.next = head;
                    bT = head;
                }
            }
            head = next;
        }
        // small and equal reconnect
        if (sT != null) {
            sT.next = eH;
            eT = eT == null ? sT : eT;
        }
        // all reconnect
        if (eT != null) {
            eT.next = bH;
        }
        return sH != null ? sH : eH != null ? eH : bH;
    }
    public static void swap(Node[] a, int less, int more){
        Node tmp = a[less];
        a[less] = a[more];
        a[more] = tmp;
    }
    public static int show(Node node, boolean flag){
        int i = 0;
        while(node != null){
            if(flag == true)
                System.out.print(node.value + " ");
            node = node.next;
            i++;
            if(i > 50){
                return 50;
            }

        }
        return i;
    }

    public static void main(String[] args) {
        int abc = 0;
        boolean flag = false;
        while(abc < 10000000) {
            Node head = new Node(10);
            Node cur = head;
            for (int i = 0; i < (int) (Math.random() * 30); i++) {
                Node node = new Node((int) (Math.random() * 50));
                cur.next = node;
                cur = node;
            }
            cur.next = null;
            System.out.print(abc + " ");
            int num1 = show(head,true);

            System.out.println();


            cur = listPartion2(head, 25);
            int num2 = show(cur,false);


            if(num1 != num2){

                System.out.println();
                show(cur,true);
                break;
            }
            abc++;


        }


    }
}
