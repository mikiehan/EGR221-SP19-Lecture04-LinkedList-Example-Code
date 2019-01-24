public class ListNodeClient {

    public static void main(String[] args) {

        //life without constructor's help
        ListNode list = new ListNode();
        list.data = 3;
        list.next = new ListNode();
        list.next.data = 7;
        list.next.next = new ListNode();
        list.next.next.data = 12;
        list.next.next.next = null;

        //life is better with constructor
        ListNode list2 = new ListNode(3,
                                      new ListNode(7,
                                                   new ListNode(12)));


        //list manipulation example
        ListNode p  = new ListNode(2, new ListNode(4));
        ListNode q = new ListNode(3, new ListNode(9));
        p.next.next = q;
        q = q.next;
        p.next.next.next = null;

    }
}
