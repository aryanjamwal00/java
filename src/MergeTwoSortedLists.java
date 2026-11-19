public class MergeTwoSortedLists {
        public ListNode mergeTwoLists(ListNode list1,ListNode list2){
            ListNode dummy = new ListNode(-1);
            ListNode ansHead = dummy;
            ListNode ansTail = dummy;

            while(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    ansTail.next = list1;
                    list1 = list1.next;
                    ansTail = ansTail.next;
                }
                else{
                    ansTail.next = list2;
                    list2 = list2.next;
                    ansTail = ansTail.next;
                }
            }
            //yaha pr 1 listfully consume aur 1 list remain
            //agar list1 fully consume nhi aur list2 fully consume
            if(list1 != null){
                ansTail.next = list1;
            }
            //agar list2 fully consume nhi aur list1 fully consume
            if(list2 != null){
                ansTail.next = list2;
            }
            //destroy dummy
            ansHead = ansHead.next;
            dummy.next = null;
            return ansHead;
        }
}
