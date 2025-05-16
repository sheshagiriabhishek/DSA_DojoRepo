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

 //Use pen and paper for ll problems
 //maybe use big and small sized pointers to differentiate

 //On excalidraw, use only black color pointers
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null&&list2==null)
            return null;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;

        ListNode newfirst, newlast;
        if(list1.val<=list2.val)
        {   
            newfirst = list1;
            list1 = list1.next;
            newlast = newfirst;
        }
        else{
            newfirst = list2;
            list2 = list2.next;
            newlast = newfirst;
        }

        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                newlast.next = list1;
                newlast = list1;
                list1 = list1.next;
            }
            else{
                newlast.next = list2;
                newlast = list2;
                list2 = list2.next;
            }
        }

        if(list1!=null){
            newlast.next = list1;
            newlast = list1;
            list1 = list1.next;
        }

        if(list2!=null){
            newlast.next = list2;
            newlast = list2;
            list2 = list2.next;
        }    

        




        return newfirst;
        
    }
}



SUBTLE POINTS:
Use pencil, paper eraser/pen , paper for linked list problems
If using ecxcalidraw, use black/not colored pointers