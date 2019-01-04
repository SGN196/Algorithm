package test.ZuoPractice.Junior;

import java.util.HashMap;

/**
 * @author SGN196
 * @date 2019/1/1 13:52
 */

public class Code_01_TrieTree {
    public static class TrieNode{
        public int path;   //有多少字符串经过该节点，即表示前缀相同
        public int end;    //表示有多少字符串到该节点结尾
//        public HashMap<Character, TrieNode> map;  //设计成数组，则更容易表达清楚
        public TrieNode[] nexts;
        public TrieNode(){
            path = 0;
            end = 0;
            nexts = new TrieNode[26];
        }

    }
    public static class Trie{
        private TrieNode root;
        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            if(word == null){
                return;
            }
            char[] chs = word.toCharArray();
            TrieNode node = root;
            int index = 0;
            for (int i = 0; i < chs.length; i++) {
                index = chs[i] - 'a';
                if(node.nexts[index] == null){
                    node.nexts[index] = new TrieNode();
                }
                node = node.nexts[index];
                node.path++;

            }
            node.end++;
        }
        public void delete(String word){
            if(search(word) != 0){
                return ;
            }
            TrieNode node = root;
            char[] chs = word.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                int index = chs[i] - 'a';
                if(--node.nexts[index].path == 0){
                    node.nexts[index] = null;
                    return;
                }
                node = node.nexts[index];
            }
            node.end--;
        }
        public int search(String word){
            if(word == null)
                return 0;
            char[] chs = word.toCharArray();
            TrieNode node = root;
            for (int i = 0; i < chs.length; i++) {
                int index = chs[i] - 'a';
                if(node.nexts[index] == null){
                    return  0;
                }
                node = node.nexts[index];
            }
            return node.end;
        }
        public int prefixNumber(String word){
            if(word == null){
                return 0;
            }
            TrieNode node = root;
            char[] chs = word.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                int index = chs[i] - 'a';
                if(node.nexts[index] == null){
                    return 0;
                }
                node = node.nexts[index];
            }
            return node.path;
        }


    }






























}
