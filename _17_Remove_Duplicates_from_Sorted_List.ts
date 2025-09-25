
class ListNode2 {
    val: number
    next: ListNode2 | null
    constructor(val?: number, next?: ListNode2 | null) {
        this.val = (val === undefined ? 0 : val)
        this.next = (next === undefined ? null : next)
    }
}

function deleteDuplicates(head: ListNode2 | null): ListNode2 | null {
    let current = head;

    while (current !== null && current.next !== null) {
        if (current.val === current.next.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}

function printList2(head: ListNode2 | null): void {
    const values: number[] = [];
    while (head !== null) {
        values.push(head.val);
        head = head.next;
    }
    console.log(values.join(" -> "));
}

const list3 = new ListNode2(1,
    new ListNode2(1,
        new ListNode2(2,
            new ListNode2(3,
                new ListNode2(3,
                    new ListNode2(3))))));

const result2 = deleteDuplicates(list3);
printList2(result2); 
