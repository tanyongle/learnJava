package sol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = Integer.parseInt(in.nextLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLine();
            }
            processBigIntSort(arr, n);
            for (String string : arr) {
                System.out.println(string);
            }
        }
        in.close();
    }

    private static void processBigIntSort(String[] arr, int n) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return compareTo(o1, o2);
            }
        });
    }

    static void quickSort(String[] arr, int low, int n) {
        if (low >= n) {
            return;
        }
        int left = low;
        int right = n - 1;
        String val = arr[low];
        while (left < right) {
            while (left < right && compareTo(val, arr[right]) <= 0) {
                right--;
            }
            if (left < right) {
                arr[left] = arr[right];
                left++;
            }
            while (left < right && compareTo(val, arr[left]) > 0) {
                left++;
            }
            if (left < right) {
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = val;
        quickSort(arr, 0, left);
        quickSort(arr, left + 1, n);
    }

    static int compareTo(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return 1;
        }
        if (str1.length() < str2.length()) {
            return -1;
        }
        return str1.compareTo(str2);
    }
}
