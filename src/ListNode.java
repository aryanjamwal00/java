public class ListNode {
    private ListNode next;

    public ListNode solve(ListNode prev,ListNode curr){
        //base case
        if(curr == null){
            return prev;
        }

        //1 case khud krenge baaki recursion
        ListNode forward = curr.next;
        curr.next = prev;
        //move curr and prev 1 step forward
        prev = curr;
        curr = forward;

        //recursion call
        ListNode ans = solve(prev,curr);
        return ans;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode ans = solve(prev,curr);
        return ans;

//        while(curr != null){
//            ListNode forward = curr.next;
//
//            curr.next = prev;
//            prev = curr;
//            curr = forward;
//        }
//        //update head --> prev
//        return prev;
    }

}
