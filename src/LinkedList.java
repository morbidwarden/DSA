import java.util.*;
class Node{
    public int data;
    public Node next;
    public Node(int value){
        this.data = value;
    }
}
public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }
    public void insert(int value){
        //creating a new node
        Node node = new Node(value);
        //Linking the Node
        if(head==null){
            // empty Linked List
            head = node;
        }
        else{
            // first you have to traverse to the whole linked list
            Node temp = new Node(value);
            head = temp;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void insertAtBegining(int value){
        Node node = new Node(value);
        if (head == null){
            
        }
    }
}
