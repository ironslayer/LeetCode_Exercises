public class _6_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
         Solution sol = new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode merged = sol.mergeTwoLists(list1, list2);

        printList(merged);
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
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
  }

// My solution
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;    
                list1 = list1.next;      
            } else {
                current.next = list2;     
                list2 = list2.next;       
            }
            current = current.next;      
        }

        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; 
    }
}


// other solution

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         if (list1 == null) return list2;
//         if (list2 == null) return list1;

//         ListNode dummy = new ListNode(-1);
//         ListNode tail = dummy;

//         ListNode p1 = list1, p2 = list2;
//         while (p1 != null && p2 != null) {
//             if (p1.val <= p2.val) {
//                 tail.next = p1;
//                 p1 = p1.next;
//             } else {
//                 tail.next = p2;
//                 p2 = p2.next;
//             }
//             tail = tail.next;
//         }

//         tail.next = (p1 != null) ? p1 : p2;
//         return dummy.next;
//     }
// }