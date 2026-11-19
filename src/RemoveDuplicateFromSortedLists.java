public class RemoveDuplicateFromSortedLists {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        // > 1 nodes
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null){
            if(prev.val != curr.val){
                prev = prev.next;
                curr = curr.next;
            }
            else{
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        //yaha pr sab duplicate remove hai
        return head;
    }
}
