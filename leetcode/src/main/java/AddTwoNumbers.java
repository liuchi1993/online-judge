import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuchi
 * @Date: 2019/8/11 22:49
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        List<Integer> list = new ArrayList<>();
        int a, b, c;
        c = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            } else {
                a = 0;
            }

            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            } else {
                b = 0;
            }

            list.add((a + b + c) % 10);
            c = (a + b + c) / 10;
        }
        if (c == 1){
            list.add(1);
        }

        result = new ListNode(list.get(0));
        if (list.size() > 1) {
            ListNode pre = result;
            ListNode current = null;
            for (int i = 1; i < list.size(); i++) {
                current = new ListNode(list.get(i));
                pre.next = current;
                pre = current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l11 = new ListNode(0);
        ListNode l12 = new ListNode(0);
        ListNode l13 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;
        ListNode l21 = new ListNode(0);
        ListNode l22 = new ListNode(0);
        ListNode l23 = new ListNode(5);
        l21.next = l22;
        l22.next = l23;
        ListNode result = addTwoNumbers.addTwoNumbers(l11, l21);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}