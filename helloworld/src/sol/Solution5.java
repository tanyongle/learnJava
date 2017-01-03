package sol;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Solution5 {

    public static void main(String[] args) {

        //在一个二维数组中，每一行都按照从左到右递增的顺序排序，
        //每一列都按照从上到下递增的顺序排序。请完成一个函数，
        //输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
        int[][] array = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };

        int target = 1;
        Solution5 so = new Solution5();
        System.out.println(so.Find(target, array));
    }

    /**
     * @param target
     * @param array
     * @return
     */

    public boolean Find(int target, int[][] array) {
        for (int x = 0; x < array.length; x++) {
            int[] line = array[x];
            for (int y = line.length - 1; y >= 0; y--) {
                int item = line[y];
                if (item == target) {
                    return true;
                }
            }
        }
        return false;
    }

}
