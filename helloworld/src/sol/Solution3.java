package sol;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution3 {

    //    a.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);
//    b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)
//    c.由a\b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2)
//    d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2
//    e.可以发现最终得出的是一个斐波那契数列：
//
//            | 1, (n=1)
//    f(n) =  | 2, (n=2)
//            | f(n-1)+f(n-2) ,(n>2,n为整数)
    public int JumpFloor(int target) {
//        if (target == 0) {
//            return -1;
//        } else if (target == 1) {
//            return 1;
//        } else if (target == 2) {
//            return 2;
//        } else {
//            return JumpFloor(target - 1) + JumpFloor(target - 2);
//        }

        if (target == 1 || target == 2) {
            return target;
        } else {
            // 第一阶和第二阶考虑过了，初始当前台阶为第三阶，向后迭代
            // 思路：当前台阶的跳法总数=当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
            int sum = 0;// 当前台阶的跳法总数
            int step1 = 2;// 当前台阶后退一阶的台阶的跳法总数(初始值当前台阶是第3阶)
            int step2 = 1;// 当前台阶后退二阶的台阶的跳法总数(初始值当前台阶是第3阶)
            for (int i = 3; i <= target; i++) {
                sum = step1 + step2;
                step2 = step1;
                step1 = sum;
            }
            return sum;
        }
    }

    public int JumpFloorII(int target) {
        return 0;
    }
}
