public class PalindromeLL {
    public ListNode getMidPoint(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }
        //mid point LL --> break
        ListNode list2 = getMidPoint(head);
        //list 1,list 2 seperate
        ListNode temp = head;

        while(temp.next != list2){
            temp = temp.next;
        }
        temp.next = null;
        //list 2 --> reverse
        ListNode head2 = reverseLL(list2);
        //list 1 list 2 compare
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }
        }
        //return t or f
        return true;
    }
}
