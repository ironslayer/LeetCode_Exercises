public class _18_Linked_List_Cycle {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Caso 1: [3,2,0,-4], pos = 1  (ciclo hacia el nodo con valor 2)
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // <-- ciclo aquí
        System.out.println("Caso 1: " + sol.hasCycle(n1)); // true

        // Caso 2: [1,2], pos = 0  (ciclo hacia el primer nodo)
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(2);
        m1.next = m2;
        m2.next = m1; // <-- ciclo aquí
        System.out.println("Caso 2: " + sol.hasCycle(m1)); // true

        // Caso 3: [1], pos = -1  (sin ciclo)
        ListNode s1 = new ListNode(1);
        System.out.println("Caso 3: " + sol.hasCycle(s1)); // false
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


//My solution
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            head = head.next;       
            fast = fast.next.next;  

            if (head == fast) {
                return true;
            }
        }

        return false;
    }
}
