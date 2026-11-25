public class kthNodeFromEndofLL {
    public int KthFromEnd(ListNode head,int k){
        ListNode prev = head;
        ListNode curr = head;

        //curr ko k jumps krwane hai
        for(int i=1;i<=k;i++){
            curr = curr.next;
        }
        //mere window ready ho gye hai
        //now i can move my window
        while(curr != null){
            curr = curr.next;
            prev = prev.next;
        }
        //yha aa gya hu agar
        //curr pkka null pr hai
        //last window pr ho
        //prev --> kth node pr hoga
        int value = prev.val;
        return value;
    }
}
