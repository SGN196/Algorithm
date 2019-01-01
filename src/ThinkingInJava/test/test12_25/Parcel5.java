package ThinkingInJava.test.test12_25;

/**
 * @author SGN196
 * @date 2018/12/25 10:46
 */
interface Destination{
    String readLabel();
}
interface Contents{
    int value();
}
public class Parcel5 {

    public Destination destination(String s){   //返回接口的导出类
        class aaa implements Destination{
            @Override
            public String readLabel() {
                return s;
            }
        }
        return new aaa();           //创建匿名内部类实例
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("helloworld");
        System.out.println(d.readLabel());

    }
}
