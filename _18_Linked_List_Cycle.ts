

function hasCycle(head: ListNode3 | null): boolean {
    let slow: ListNode3 | null = head;
    let fast: ListNode3 | null = head;

    while (fast !== null && fast.next !== null) {
        slow = slow!.next;        
        fast = fast.next.next;     

        if (slow === fast) {     
            return true;
        }
    }

    return false; 
}

class ListNode3 {
    val: number;
    next: ListNode3 | null;
    constructor(val?: number, next?: ListNode3 | null) {
        this.val = (val === undefined ? 0 : val);
        this.next = (next === undefined ? null : next);
    }
}

let node1 = new ListNode3(3);
let node2 = new ListNode3(2);
let node3 = new ListNode3(0);
let node4 = new ListNode3(-4);

node1.next = node2;
node2.next = node3;
node3.next = node4;
node4.next = node2; 

console.log(hasCycle(node1));

let n1 = new ListNode3(1);
let n2 = new ListNode3(2);
n1.next = n2;

console.log(hasCycle(n1)); 
