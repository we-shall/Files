/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

/**
 *
 * @author vishalsingh
 */
public class SortLinkedList {
    
    public static void main(String[] args) {
        
        
        LinkedListNode ll = new LinkedListNode();
        ll.addElementFront(1);
        ll.addElementFront(2);
        ll.addElementFront(0);
        
        ll.addElementFront(11);
        ll.addElementFront(-2);
        ll.addElementFront(99);
        
        ll.printList();
        
        
    }
    
}

class Node {
    private int num;
    private Node next;
    
    Node (int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
}

class LinkedListNode {
     private Node head;
     private int size;
     
     void addElementFront (int num){
         Node node = new Node(num);
         
         if (head == null){
             head = node;
         }
         else{
             //traverse to find correct position of node...
            Node temp = head;
            Node temp1 = head;
            while (temp != null){
                if (temp.getNum() > num)
                {
                    node.setNext(temp);
                    if (temp1 == head && temp == head)
                        head = node;
                    else
                        temp1.setNext(node);
                    break;
                }
                temp1 = temp;
                temp = temp.getNext();
                
                if (temp == null)
                {
                    temp1.setNext(node);
                    node.setNext(null);
                }
            }
         }
         
         
         size ++;
     }
     
     void printList (){
         Node temp = head;
         while (temp!=null)
         {
             System.out.print(" => ");
             System.out.println(temp.getNum());
             temp = temp.getNext();
             
         }
     }
     
    
    
}
