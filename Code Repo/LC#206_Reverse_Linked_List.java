/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null)
        return null;
        
        ListNode prev, cur, nxt;
        prev = null;
        cur = head;
        nxt = cur.next;

        while(cur!=null){

            cur.next = prev;
            prev = cur;
            cur = nxt;
            if(nxt!=null)
            nxt = nxt.next;
        }

        return prev;
        
    }
}

//TIME(Section wise)

	//Thinking and coding - 23 minutes

	//Submissions(After edge case) - 6 minutes

//PROBLEM LINK: https://leetcode.com/problems/reverse-linked-list/

/*FEEDBACK log:

1. Had earlier made up logic where within one movement of all pointers (cur, prev and next), two nodes link reversals were being done.
2. Line 28: error: missing return statement
    }
3. 0 element [] LL edge case not considered.


*/

/*
SUBTLE POINTS
-3 pointers are required
-Check needs to be placed within loop to check if last.next will be accessed when last = null

*/