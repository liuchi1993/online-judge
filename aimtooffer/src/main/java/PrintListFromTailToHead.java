import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: liuchi
 * @Date: 2019/7/31 23:45
 */
public class PrintListFromTailToHead {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        printListFromTailToHead(listNode.next);
        list.add(listNode.val);
        return list;
    }

    //no recursion,usse iteration
    public ArrayList<Integer> printListFromTailToHead2(ListNode first) {
        ListNode current = null;
        ListNode endNode = null;
        while (endNode != first) {
            current = first;
            while (current.next != endNode) {
                current = current.next;
            }
            list.add(current.val);
            endNode = current;
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ArrayList<Integer> list = new PrintListFromTailToHead().printListFromTailToHead2(node1);
        for (Integer i : list) {
            System.out.println(i);
        }

    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

