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

        buffer1.delete(1,2);
        System.out.println(buffer1);

        buffer1.insert(1,"o");
        System.out.println(buffer1);



    }
}
