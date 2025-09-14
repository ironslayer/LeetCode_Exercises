
class ListNode {
    val: number;
    next: ListNode | null;
    constructor(val?: number, next?: ListNode | null) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
}
// My solution
// function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
//     const dummy = new ListNode(0);
//     let current = dummy;

//     while (list1 !== null && list2 !== null) {
//         if (list1.val <= list2.val) {
//             current.next = list1;
//             list1 = list1.next;
//         } else {
//             current.next = list2;
//             list2 = list2.next;
//         }
//         current = current.next;
//     }

//     if (list1 !== null) current.next = list1;
//     if (list2 !== null) current.next = list2;

//     return dummy.next; 
// }

//other solution
function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    let newList = list1.val < list2.val ? list1 : list2;
    let curList1 = list1.val < list2.val ? list1.next : list1;
    let curList2 = list1.val < list2.val ? list2 : list2.next;
    let newListAnchor = newList;
    while (curList1 != null || curList2 != null) {
        if (curList1 == null) {
            newList.next = curList2;
            curList2 = curList2?.next ?? null;
            newList = newList.next!;
            continue;
        }
        if (curList2 == null) {
            newList.next = curList1;
            curList1 = curList1.next;
            newList = newList.next;
            continue;
        }

        if(curList1.val < curList2.val) {
            newList.next = curList1;
            curList1 = curList1.next;
        }
        else {
            newList.next = curList2;
            curList2 = curList2.next;
        }

        newList = newList.next;
    }

    return newListAnchor;
};

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
