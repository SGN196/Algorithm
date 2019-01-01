package test.ZuoPractice.Junior;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @author SGN196
 * @date 2018/12/28 20:03
 *
 * 遍历树相关
 */

public class ErgodicTree {
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
    public static void recursion01(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.value + " ");
        recursion01(head.left);
        recursion01(head.right);
    }
    public static void unrecurision01(Node cur){
        if(cur == null){
            return;
        }
        Stack<Node>stack = new Stack<Node>();
        stack.push(cur);
        while(!stack.isEmpty()){
            cur = stack.pop();
            System.out.print(cur.value + " ");
            if(cur.right != null){
                stack.push(cur.right);
            }
            if(cur.left != null){
                stack.push(cur.left);
            }

        }
    }
    public static void recursion02(Node head){
        if(head == null){
            return;
        }
        recursion02(head.left);
        System.out.print(head.value + " ");
        recursion02(head.right);
    }

    /**
     * 使用递归的方式，判断某个树是否为搜索树
     * @param head
     */
    public static void recursionBST02(Node head){
        if(head == null){
            return;
        }
        recursion02(head.left);
        System.out.print(head.value + " ");
        recursion02(head.right);
    }

    /**
     * 使用非递归的方式，来判断某个树是否为搜索二叉树
     *
     *
     *
     * @param cur
     * @return
     */
    public static boolean unrecurision02(Node cur){
        if(cur == null){
            return true;
        }
        Stack<Node>stack = new Stack<Node>();

//        while(!stack.isEmpty() || cur != null) {
//            if(cur != null){
//                stack.push(cur);
//                cur = cur.left;
//
//            }else{
//                cur = stack.pop();
//                System.out.print(cur.value + " ");
//                cur = cur.right;
//            }
//        }
        int lastNum = Integer.MIN_VALUE;
        boolean bst = true;
        while(!stack.isEmpty() || cur != null){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                if(bst && (lastNum < cur.value)) {
                    lastNum = cur.value;
                }else{
                    bst = false;
                }
                System.out.print(cur.value + " ");

                cur = cur.right;
            }
        }
        return bst;
    }
    public static Node inorderNext(Node node){
        if(node == null){
            return null;
        }
        Node cur = node;
        if (node.right != null) {  //右子树的最左结点
            cur = node.right;
            while (cur.left != null) {
                cur = cur.left;
            }
            return cur;
        }else{
            do{
                if(cur.parent.left == cur)
                    return cur.parent;
                cur = cur.parent;
            }while(cur.parent != null);

        }
        return null;

    }
    public static Node inorderLast(Node node){
        if(node == null){
            return null;
        }
        Node cur = node;
        if(cur.left != null){
            cur = cur.left;
            while(cur.right != null){
                cur = cur.right;
            }
            return cur;
        }else{
            do{
                if(cur.parent.right == cur)
                    return cur.parent;
                cur = cur.parent;
            }while(cur.parent != null);

        }
        return null;
    }
    public static String Serializable(Node head){
        Node father = head;
        Node child = null;
        Stack<Node> stack = new Stack<Node>();
        StringBuffer sb = new StringBuffer();
        stack.push(head);
        while(!stack.isEmpty()){
            father = stack.pop();
            System.out.print(father.value +  " ");
            sb.append(father.value + "_");

            if(father.right != null) {
                stack.push(father.right);
            }else{
                sb.append("#_");
            }
            if(father.left != null) {
                stack.push(father.left);
            }else{
                sb.append("#_");
            }
        }

            //            sb.append(child.value + "_");
        System.out.println();
        return sb.toString();
    }

    /**
     * 反序列化二叉树
     * @param str
     * @return
     */
    public static Node reSerializable(String str){
        String[] values = str.split("_");
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < values.length; i++) {
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);
    }

    public static Node reconPreOrder(Queue<String> queue){
        String str = queue.poll();
        if(str.equals("#")){                    //当前节点为空时，返回一个null对象，作为子树的儿子
            return null;
        }
        Node head = new Node(Integer.parseInt(str));
        head.left = reconPreOrder(queue);
        head.right = reconPreOrder(queue);
        return head;
    }

    /**
     * 判断完全二叉树
     */
    public static boolean isCBT(Node head){
        if(head == null){
            return true;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(head);
        boolean flag = false;
        Node l = null, r = null;
        while(!queue.isEmpty()){
            head = queue.peek();
            l = head.left;
            r = head.right;
            if((flag && (l != null || r != null)) || (l == null && r != null)){
                return false;
            }
            if(l != null){
                queue.offer(l);
            }
            if(r != null){
                queue.offer(r);
            }else{
                flag = true;
            }
        }
        return flag;
    }

    /**
     *
     * 求完全二叉树的节点个数
     * @param: l  表示当前节点所在的层数
     */
//    public static int totalCBT(Node head){
//        if(head == null){
//            return 0;
//        }
//        return bs(head, 1, mostLeftLevel(head, 1));
//    }
//    public static int bs(Node node, int level, int h){
//        if(level == h){
//            return 1;
//        }
//        if(mostLeftLevel(node.right, level + 1) == h){
//            return (1 << (h - level)) + bs(node.right, level + 1, h);   //左树的节点个数 + 右
//        }else{
//            return (1 << (h - level - 1)) + bs(node.left, level + 1, h);
//        }
//    }
//    public static int mostLeftLevel(Node node, int level){  //左子树高度
//        while(node != null){
//            level++;
//            node = node.left;
//        }
//        return level - 1;
//    }
    public static int totalCBT(Node head){
        if(head == null)
            return 0;
        return bs(head, 1, mostLeftLevel(head, 1) );
    }
    public static int bs(Node node, int level, int h){
        if(level == h)
            return 1;
        if(mostLeftLevel(node.right, level + 1) == h){   //左右子树高度一样
            return (2 << (h - level))  + bs(node.right, level + 1, h);
        }
        else{
            return (2 << (h - 1 - level));
        }
    }
    public static int mostLeftLevel(Node node, int level){
        while(node != null){
            node = node.left;
            level++;
        }
        return level - 1;
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

        Node bstHead = new Node(7, null);
        bstHead.left = new Node(4, head);
        bstHead.right = new Node(9, head);
        bstHead.left.left = new Node(2,head.left);
        bstHead.left.right = new Node(6,head.left);
        bstHead.right.left = new Node(8,head.right);
        bstHead.right.right = new Node(10,head.right);
        bstHead.left.left.left = new Node(1,head.left.left);
        bstHead.left.left.right = new Node(3,head.left.left);
        bstHead.left.right.left = new Node(5, head.left.right);

//        recursion01(head);
//        System.out.println();
//        unrecurision01(head);
//        System.out.println("\n----------------");


        /**
         * 平衡
         */
        recursion02(bstHead);
        System.out.println();
        System.out.print(unrecurision02(bstHead));
        System.out.println("\n----------------");
        System.out.println(totalCBT(bstHead));
//
//        System.out.println(inorderNext(inorderNext(inorderNext(inorderNext(inorderNext(inorderNext(inorderNext(inorderNext(head.left.left.left)))))))).value);
//        System.out.println(inorderLast(head).value);


        /**
         * 序列化与反序列化测试
         */
//        recursion01(head);
//        System.out.println();
//        String str = Serializable(head);
//        System.out.println(str);
//        System.out.println("\n----------------");
//        Node node = reSerializable(str);
//        recursion01(node);

    }
}
