package ThinkingInJava.test.day1_2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SGN196
 * @date 2019/1/3 9:52
 */

public class Code_03_IPO {
    public static class Node {
        public int p; //收益
        public int c; //花费
        public Node(int p, int c) {
            this.p = p;
            this.c = c;
        }
    }

    public static class MinCostComparator implements Comparator<Node> {

        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }
    }

    public static class MaxProfitComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            int x1 = o1.p - o1.c;
            int x2 = o2.p - o2.c;
            return x2 - x1;
        }
    }

    public static int findMaxMizedCapital(int k, int W, int[] Profits, int[] Capital) { //k：次数  W：金额

        int sum = 0;
        PriorityQueue<Node> min = new PriorityQueue<Node>(new MinCostComparator());
        PriorityQueue<Node> max = new PriorityQueue<Node>(new MaxProfitComparator());
        Node[] nodes = new Node[Profits.length];
        for (int i = 0; i < Profits.length; i++) {
            nodes[i] = new Node(Profits[i], Capital[i]);
            min.offer(nodes[i]);
        }
        for (int i = k; i > 0 ; i--) {
            while(!min.isEmpty() && W >= min.peek().c){
                max.offer(min.poll());
            }
            if(!max.isEmpty()){
                W = W - max.peek().c + max.poll().p;
            }else{
                break;
            }

        }
        return W;

    }

    public static void main(String[] args) {
        int[] c = {7, 3, 4, 8, 2, 5};
        int[] p = {2, 4, 3, 4, 5, 6};
        System.out.println("all money: " + findMaxMizedCapital(4, 7, p, c));
    }

}
