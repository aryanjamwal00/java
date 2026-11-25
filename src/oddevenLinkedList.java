public class oddevenLinkedList {
    public ListNode oddEvenList(ListNode head){
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        //>1 nodes
        //rearrange
        ListNode oddHead = head;
        ListNode evenHead = head;
        ListNode oddTail = head.next;
        ListNode evenTail = head.next;

        while(evenTail != null && evenTail.next != null){
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }
        //update the list
        oddTail.next = evenHead;
        evenTail = null;

        //return modified head
        return oddHead;
    }
}
