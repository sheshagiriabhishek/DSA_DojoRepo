//Attempt2:Submitted successfully
1. Error: Found loop in the output (had to trace on paper clearly even after base algorithm was prepared)
2. Need to think of edge case if(head.next==null||head.next.next==null)

class Solution {
    public void reorderList(ListNode head) {
        if(head.next==null||head.next.next==null)
            return;
        List<ListNode> list = new ArrayList<>();
        ListNode it = head;

        while(it!=null){
            list.add(it);
            it = it.next;
        }

        int first = 0, last = list.size()-1;
        ListNode fnode = null;
        ListNode snode = null;
        while(first+1<last){
            fnode = list.get(first);
            snode = list.get(last);
            fnode.next = snode;
            first++;
            fnode = list.get(first);
            snode.next = fnode;
            last--;
        }


        if(list.size()%2==0)
        {
            fnode = fnode.next;
            fnode.next = null;
        }
        else
        fnode.next = null;
    }
}