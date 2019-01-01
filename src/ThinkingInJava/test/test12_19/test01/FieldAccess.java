package ThinkingInJava.test.test12_19.test01;

/**
 * @author SGN196
 * @date 2018/12/19 11:33
 */

class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    public int getField(){
        return super.field;
    }
    public int getSuperField(){
        return super.field;
    }
}


public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println(sup.field);
        System.out.println();
    }

}
