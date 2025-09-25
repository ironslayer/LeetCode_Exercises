
public class _17_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {
         Solution sol = new Solution();

        // ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2)));

        ListNode list2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(3))))));

        // ListNode ans1 = sol.deleteDuplicates(list1);

        ListNode ans2 = sol.deleteDuplicates(list2);

        // printList(ans1);

        printList(ans2);


    }
    
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


 // My solution
// class Solution {

//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;

//         int aux = 0;
//         while (head != null) {
//             if (head.val > aux) {
//                 current.next = head;
//                 aux = head.val;
//                 current = current.next;
//             }
//             head = head.next;
//         }
//         current.next = null;
//         return dummy.next; 
//     }
// }

//Other solution
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}