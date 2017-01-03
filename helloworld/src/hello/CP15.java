package hello;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2016/12/14.
 */
public class CP15 {
    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("菜鸟教程官网");
        buffer.append(" www");
        buffer.append(".runoob");
        buffer.append(".com");
        System.out.println(buffer);

        StringBuffer buffer1 = buffer.reverse();
        System.out.println(buffer1);

        buffer1.delete(1, 2);
        System.out.println(buffer1);

        buffer1.insert(1, "o");
        System.out.println(buffer1);

        //声明数组变量
        //dataType[] arrayRefVar
        //double[] myList;

        int size = 10;
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("The total is: " + total);


        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");


        CP15 cp15 = new CP15();
        System.out.println("使用 Java 7 语法: ");
        cp15.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("使用 Java 8 语法: ");

        cp15.sortUsingJava8(names2);
        System.out.println(names2);


        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;


        System.out.println("10 + 5 = " + cp15.operater(10, 5, addition));
        System.out.println("10 - 5 = " + cp15.operater(10, 5, subtraction));
        System.out.println("10 * 5 = " + cp15.operater(10, 5, multiplication));
        System.out.println("10 / 5 = " + cp15.operater(10, 5, division));


        GreetingService greetingService1 = message -> System.out.println("hello " + message);
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetingService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");

        GreetingService greetingService3 = message -> System.out.println(salutation + message);
        greetingService3.sayMessage("Runoob...");


        List<String> names = new ArrayList<>();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
        System.out.println("输出所有数据");
        eval(list, n -> true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true
        System.out.println("输出所有偶数:");
        eval(list, n -> n % 2 == 0);

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n -> n > 3);


    }


    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));
    }


    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operater(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
