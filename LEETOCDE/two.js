/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let l1_reversed_numbers = "";
    let l2_reversed_numbers = "";
    while (l1 || l2) {
        if (l1) {
            l1_reversed_numbers += l1.val.toString()
            l1 = l1.next;
        }
        if (l2) {
            l2_reversed_numbers += l2.val.toString();
            l2 = l2.next;
        }
    }
    l1_reversed_numbers = l1_reversed_numbers.split("").reverse("").join("")
    l2_reversed_numbers = l2_reversed_numbers.split("").reverse("").join("")
    let sum = BigInt(l1_reversed_numbers) + BigInt(l2_reversed_numbers);
    sum = sum.toString().split("").reverse("")

    sum.forEach((number, index) => {
        sum[index] = new ListNode(number)
        if (index != 0) {
            sum[index - 1].next = sum[index]
        }
    })

    return sum[0]
};