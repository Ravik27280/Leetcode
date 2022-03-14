

class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
  }

class RemoveDuplicatesFromSortedList {
    public ListNode2 deleteDuplicates(ListNode2 head) {
        ListNode2 newlist=new ListNode2();
        newlist.next=head;
        ListNode2 prev=newlist;
        ListNode2 curr=head;

        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                prev.next=curr.next;

            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return newlist.next;

    }
}


