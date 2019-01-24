public class ListNode{
    public int data;
    public ListNode next;

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int data) {
        this(data, null);
    }

    public ListNode() {
        this(0, null);
    }
}



























//public class ListNode {
//    public int data;
//    public ListNode next; //recursive data structure
//
//    //12
//    public ListNode(int data, ListNode next){
//        this.data = data;
//        this.next = next;
//    }
//
//    //13
//    public ListNode(int data){
//        this(data, null); //calling line 5 constructor
//    }
//
//    //14
//    public ListNode(){
//        this(0, null); //0 is default value for data
//    }
//}
