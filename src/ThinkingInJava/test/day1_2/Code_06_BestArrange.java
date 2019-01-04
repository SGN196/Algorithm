package ThinkingInJava.test.day1_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author SGN196
 * @date 2019/1/3 11:56
 */

public class Code_06_BestArrange {
    public static class Program{
        public int start;
        public int end;
        public Program(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static class ProgramComparator implements Comparator<Program>{
        @Override
        public int compare(Program o1, Program o2) {
            return o1.end - o2.end;  //返回小的
        }
    }

    public static int bestArrange(int time, Program[] programs){
        Arrays.sort(programs, new ProgramComparator());
//        PriorityQueue<Program> endQueue = new PriorityQueue<Program>(new ProgramComparator());
        int result = 0;
        int cur = 0;
        for (int i = 0; i < programs.length; i++) {
            if(cur <= programs[i].start){
                cur = programs[i].end;
                ++result;
            }

        }
        return result;
    }



    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4, 5, 6, 8, 8, 2};
        int[] b = {4, 5, 6, 7, 9, 9, 10, 11, 12, 13};
        Program[] programs = new Program[a.length];

        for (int i = 0; i < a.length; i++) {
            programs[i] = new Program(a[i], b[i]);
//            queue.offer(programs[i]);
        }
        System.out.println(bestArrange(12, programs));


    }
}
