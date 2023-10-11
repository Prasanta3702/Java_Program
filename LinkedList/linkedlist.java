class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return this.data;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getNext() {
        return this.next;
    }
}
public class linkedlist {
    public int length(ListNode headNode) {
        int count =0;
        ListNode temp = headNode;
        while(temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}