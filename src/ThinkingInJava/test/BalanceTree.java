package ThinkingInJava.test;

/**
 * @author SGN196
 * @date 2018/12/29 22:59
 */

public class BalanceTree {          //重要的还是结构设计 吧
    public static class Node{
        int value;
        Node left;
        Node right;
        Node parent;
        Node(Integer i){
            value = i;
        }
        Node(Integer data, Node parent){
            this.value = data;
            this.parent = parent;
        }
    }
    public static class ReturnData{
        public boolean isB;
        public Integer h;

        public ReturnData(boolean isB, Integer h){
            this.isB = isB;
            this.h = h;
        }
    }
    public static ReturnData process(Node head){
        if(head == null){
            return new ReturnData(true, 0);
        }
        ReturnData leftData = process(head.left);
        if(leftData.isB == false){
            return new ReturnData(false, 0);
        }
        ReturnData rightData = process(head.right);
        if(rightData.isB == false){
            return new ReturnData(false, 0);
        }

        if(Math.abs(leftData.h - rightData.h) > 1){
            return new ReturnData(false, 0);
        }
        int h = Math.max(leftData.h, rightData.h) + 1;
        return new ReturnData(true, h);
    }
    public static boolean isBST(Node head){
        if(head == null){
            return true;
        }
        boolean res = true;
        Node pre = null;
        Node cur1 = head;
        Node cur2 = null;
        while(cur1 != null){
            cur2 = cur1.left;
            if(cur2 != null){  //cur1左子树不为空
                while(cur2.right != null && cur2.right !=cur1){
                    cur2 = cur2.right;
                }
                if(cur2.right == null){
                    cur2.right = cur1;
                    cur1 = cur1.left;
                    continue;
                }else{
                    cur2.right = null;
                }
            }
            if(pre != null && pre.value > cur1.value){
                res = false;
            }
            pre = cur1;
            cur1 = cur1.right;
        }
        return res;

    }

    public static void main(String[] args) {
        Node head = new Node(0, null);
        head.left = new Node(1, head);
        head.right = new Node(2, head);
        head.left.left = new Node(3,head.left);
        head.left.right = new Node(4,head.left);
        head.right.left = new Node(5,head.right);
        head.right.right = new Node(6,head.right);
        head.left.left.left = new Node(7,head.left.left);
        head.left.left.right = new Node(8,head.left.left);
        head.left.right.left = new Node(9, head.left.right);
        head.left.left.left.left = new Node(10, head.left.left.left);

        System.out.println(process(head).h);




    }
}
