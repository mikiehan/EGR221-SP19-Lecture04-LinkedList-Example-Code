public class LinkedList {
    private ListNode first;

    public LinkedList(){
        first = null;
    }

    //add newData to the end of the list
    public void add(int newData){
        if(first == null){ // there was no element in this linked list
            first = new ListNode();
            first.data = newData; //first.setData(newData);
            first.next = null;

        }else { //it was not empty linked
            ListNode current = first;
            while(current.next != null){
                current = current.next;
            }
            //at this point current.next is null
            //which means current is the last element
            current.next = new ListNode(newData); //add newData at the end
        }
    }

    //Remove all nodes with value of dataToRemove
    public void remove(int dataToRemove){
        ListNode current = first;
        ListNode prev = null;
        while(current != null){
            if(current.data == dataToRemove){
                //found let's remove current
                if(prev == null){ //removing the first
                    first = first.next; //make the second the first
                }else{
                    //prev next is now skipping current
                    prev.next = current.next;
                }
                //prev shouldn't change
            }else{
                prev = current; //if we didn't remove then update prev
            }
            current = current.next; //update current
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = first;
        while(current != null){
            sb.append("[" + current.data + "] ");
            if(current.next != null){
                sb.append("-> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
