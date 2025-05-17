//ATTEMPT: 2
//TIME TAKEN: 29 minutes to final submission, after adding edge case
1. Need to add edge case to detect fast pointer being null after moving two places at once
	if(fast==null||fast.next==null)
                break;
2. took a little time to understand fast.next==null  => break out of loop
3. UNDERSTANDing: 

1. fast, slow start off at first position

SLOW pointer movement
2. slow pointer on traversing n links, comes to first node(starting position) in case loop exists

FAST pointer movement
3. if n==even, fast comes to first node, after round 1
4. if n==odd, fast comes to second node, after round 1

How do they MEET?
6. slow, comes to first node, after every round
7. So, in both odd and even node cases, slow and fast meet after the pointers have completed two rounds of traversals

public class Solution {
    public boolean hasCycle(ListNode head) {

        
        ListNode fast = head, slow = head;

        while(slow!=null){
            slow = slow.next;
            if(fast==null||fast.next==null)
                break;
            fast = fast.next.next;

            if(slow==fast)
                return true;
        }

        return false;
        
    }
}