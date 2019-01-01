package ThinkingInJava.test;

import java.util.Scanner;

/**
 * @author SGN196
 * @date 2018/12/27 14:20
 */

public class MyDate {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        int day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        try {
            year = scanner.nextInt();
            if (year < 1900 || year > 2050) {
                System.out.println("请输入正确的年份");
                year = scanner.nextInt();
                return;
            }
        } catch (Exception e) {
            System.out.println("请输入合法的数字");
            return;
        }
        System.out.println("请输入月份");
        try {
            month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("请输入正确的月份");
                month = scanner.nextInt();
                return;
            }
        } catch (Exception e) {
            System.out.println("请输入合法的数字");
            return;
        }
        System.out.println("请输入天");
        try {
            day = scanner.nextInt();
            if (day < 1 || day > 31) {
                System.out.println("请输入正确的天数");
                day = scanner.nextInt();
                return;
            }
        } catch (Exception e) {
            System.out.println("请输入合法的数字");
            return;
        }

        System.out.println("当前日期为：" + year + "年   " + month + "月   " + day + "日");

        String end = NextDate(year, month, day);
        System.out.println(end);
    }

    public static String NextDate(int year, int month, int day) {
        String str = "";
        int nextYear = year;
        int nextMonth = month;
        int nextDay = day;
        if (nextDay == 31 && nextMonth < 12) {
            nextDay = 1;
            nextMonth = nextMonth + 1;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear = nextYear + 1;
                str = "第二天日期为：" + nextYear + "年   " + nextMonth + "月   " + nextDay + "日";
            }
        } else if (nextDay < 31 && nextMonth == 12) {
            nextMonth = nextMonth;
            nextYear = nextYear;
            nextDay = nextDay + 1;
            str = "第二天日期为：" + nextYear + "年   " + nextMonth + "月   " + nextDay + "日";
        } else if (nextDay == 31 && nextMonth == 12) {
            nextDay = 1;
            nextMonth = 1;
            nextYear = nextYear + 1;
            str = "第二天日期为：" + nextYear + "年   " + nextMonth + "月   " + nextDay + "日";

        }
        return str;
    }

    void DoWork(int x, int y, int z) {
        double k = 0, j = 0;
        if ((x > 3) && (z < 10)) {
            k = x * y - 1;
            j = Math.sqrt(k);
        }
        if ((x == 4) || (y > 5))
            j = x * y + 10;
        j = j % 3;
    }
}

/**
 *
 * 1	int k=0,j=0;
 * 2	if ((x>3 ) && (z<10))
 * 3	{
 * 4     	k=x*y-1;
 * 5		j=sqrt(k);
 * 6	}
 * 7	if ((x==4)||(y>5))
 * 8	    j=x*y+10;
 * 9	j=j%3;
 * 10	}
 */
