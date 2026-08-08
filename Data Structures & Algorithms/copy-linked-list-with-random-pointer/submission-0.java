/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
        return null;
        }
        copyListInBetween(head);
        connectTheRandomPtr(head);
        return connectTheNextPointers(head);
    }
    private void copyListInBetween(Node head){
        Node temp = head;
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
    }
    private void connectTheRandomPtr(Node head){
        Node temp = head;
        while(temp != null){
            Node copyNode = temp.next;
            if (temp.random != null) 
            copyNode.random = temp.random.next;
            temp = temp.next.next;
        }
    }
    private Node connectTheNextPointers(Node head){
        Node dummyNode = new Node(-1);
        Node copyNode = dummyNode;
        Node temp = head;
        
        while(temp != null){
            copyNode.next = temp.next;
            temp.next = temp.next.next;
            copyNode = copyNode.next;
            temp = temp.next;
        }
        
        return dummyNode.next;
    }
}

