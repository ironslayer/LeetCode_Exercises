
class ListNode {
    val: number;
    next: ListNode | null;
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
}
// My solution
function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
    const dummy = new ListNode(0);
    let current = dummy;

    while (list1 !== null && list2 !== null) {
        if (list1.val <= list2.val) {
            current.next = list1;
            list1 = list1.next;
        } else {
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }

    if (list1 !== null) current.next = list1;
    if (list2 !== null) current.next = list2;

    return dummy.next; 
}

function printList(head: ListNode | null) {
    let cur = head;
    const res: number[] = [];
    while (cur !== null) {
        res.push(cur.val);
        cur = cur.next;
    }
    console.log(res.join(" -> "));
}

const list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
const list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
const merged = mergeTwoLists(list1, list2);
printList(merged); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
