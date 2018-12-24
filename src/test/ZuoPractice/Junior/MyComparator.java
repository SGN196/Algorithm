package test.ZuoPractice.Junior;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author SGN196
 * @date 2018/12/17 23:29
 */

public class MyComparator {

    public static class Student{
        String name;
        int id;
        int age;

        public  Student(String name, int id, int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", age=" + age +
                    '}';
        }
    }

    public static class IdAscendingComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.id < o2.id){
                return -1;
            }else
                if(o1.id > o2.id)
                    return 1;
                else
                    return 0;

        }
    }

    public static void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());

        }
        System.out.println("------------------");
    }


    public static class AgeAsccendingComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.age < o2.age)
                return -1;
            else if(o1.age > o2.age)
                return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 1, 23);
        Student student2 = new Student("B", 2, 21);
        Student student3 = new Student("C", 3, 22);


//        Student[] students = new Student[] {student3, student2, student1};
//        printStudents(students);
//        Arrays.sort(students, new IdAscendingComparator());
//        printStudents(students);
//        Arrays.sort(students, new AgeAsccendingComparator());
//        printStudents(students);

        PriorityQueue<Student> heap = new PriorityQueue<Student>(new AgeAsccendingComparator());

        heap.add(student1);
        heap.add(student2);
        heap.add(student3);

        while(!heap.isEmpty()){
            Student stu = heap.poll();
            System.out.println(stu.toString());
        }

    }
}
