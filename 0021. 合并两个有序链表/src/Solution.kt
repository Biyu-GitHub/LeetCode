class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var dummyHead = ListNode(-1)
        var cur = dummyHead
        var p1 = l1
        var p2 = l2

        while (p1 != null && p2 != null) {
            if (p1.`val` <= p2.`val`) {
                cur.next = p1
                p1 = p1?.next
            } else {
                cur.next = p2
                p2 = p2?.next
            }
            cur = cur.next
        }

        if (p1 == null) {
            cur.next = p2
        }
        if (p2 == null) {
            cur.next = p1
        }

        return dummyHead.next
    }
}