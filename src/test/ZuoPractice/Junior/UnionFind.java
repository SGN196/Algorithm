package test.ZuoPractice.Junior;

import java.util.HashMap;

/**
 * @author SGN196
 * @date 2019/1/1 11:19
 */

public class UnionFind {
    public static class Node{

    }
    public static class UnionFindSet{
        public HashMap<Node, Node> fatherMap;  //key ： child， value ： father
        public HashMap<Node, Integer> sizeMap;

        public UnionFindSet(){
            fatherMap = new HashMap<Node, Node>();
            sizeMap = new HashMap<Node, Integer>();
        }
    }
}
