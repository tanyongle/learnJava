package sol;

/**
 * Created by Administrator on 2016/12/26.
 */
public class ListNode {
    private int val;
    private ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
