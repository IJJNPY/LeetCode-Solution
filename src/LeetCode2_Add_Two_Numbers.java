public class LeetCode2_Add_Two_Numbers {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //creat a new ListNode and choose a pointer as start
        ListNode p1 = new ListNode(0);
        ListNode cur = p1;
        //define a parameter to store the carry of each sum
        int carry = 0;
        //if any of the given listnode is not null or the carry is not zero, the new listnode should
        //be created. So a while loop should be used to express these conditions.
        while(l1!=null||l2!=null||carry!=0){
            //The value of l1 and l2 should be identified and the condition like l1 and l2 is null
            //should be considered.
            int x = (l1 !=null)? l1.val : 0;
            int y = (l2 !=null)? l2.val : 0;
            //define a parameter to present the total value of each sum and separate
            // the carry and local value
            int sum = carry + x +y;
            carry = sum / 10;
            //define the next node of target listnode using current pointer and move the pointer to next
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            //move the pointer of l1 and l2 to the next node if it is not null
            l1 = (l1 !=null)? l1.next : l1;
            l2 = (l2 !=null)? l2.next : l2;
        }
        return p1.next;
    }
}
