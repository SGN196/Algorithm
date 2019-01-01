package ThinkingInJava.test;

import java.util.Scanner;

/**
 * @author SGN196
 * @date 2018/12/27 14:15
 */

public class Customer {
    public static void main(String[] args) {
        int pay = 0;
        int cost = 0;
        int change = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 请输入顾客付款金额");
        try {
            pay = scanner.nextInt();
            if (pay > 100 || pay < 0) {
                System.out.println("请输入正确金额");
                return;
            }

        } catch (Exception e) {
            System.out.println("请输入合法数字");
            return;
        }

        System.out.println("请输入商店货品价格");
        try {
            cost = scanner.nextInt();
            if (cost > 100 || cost < 0) {
                System.out.println("请输入正确金额");
                return;
            } else if (cost > pay) {
                System.out.println("您的消费金额超出支付金额");
            }
        } catch (Exception e) {
            System.out.println("请输入合法数字");
            return;
        }

        change = pay - cost;

        System.out.println("付款金额"+pay+"   商品价格"+cost+"   应找金额"+change);

        String end = giveChange(change);
        System.out.println("此次消费金额  "+change+" 元，其中应找     "+end);
    }



    public static String giveChange(int change){

        String str = "";
        int qianshu;//应该找钱的张数
        int leftmoney = change;//还剩下多少钱，初始值为change

        if(leftmoney/50!=0){
            qianshu = leftmoney/50;
            str=str+qianshu+"张50元";
            leftmoney = leftmoney-qianshu*50;
        }

        if(leftmoney/10!=0){
            qianshu = leftmoney/10;
            str=str+qianshu+"张10元";
            leftmoney = leftmoney-qianshu*10;
        }

        if(leftmoney/5!=0){
            qianshu = leftmoney/5;
            str=str+qianshu+"张5元";
            leftmoney = leftmoney-qianshu*5;
        }

        if(leftmoney/1!=0){
            qianshu = leftmoney/1;
            str=str+qianshu+"张1元";
            leftmoney = leftmoney-qianshu*1;
        }

        System.out.println("剩余没找的钱数为："+leftmoney);

        return str;

    }

}
