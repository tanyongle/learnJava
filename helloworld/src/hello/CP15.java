package hello;

/**
 * Created by Administrator on 2016/12/14.
 */
public class CP15 {
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




    }
}
