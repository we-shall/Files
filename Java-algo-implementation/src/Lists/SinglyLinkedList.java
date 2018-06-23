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
public class SinglyLinkedList {
    
    public static void main(String[] args)
    {
        EmployeeLinkedList list = new EmployeeLinkedList();
        
        System.out.println("list is empty or not..?" + list.isEmpty());
        
        list.addToFront(new Employee(1,"vishal1","singh"));
        System.out.println("number of element" + list.getCount());
        list.addToFront(new Employee(2,"vishal1","singh"));
        list.addToFront(new Employee(3,"vishal1","singh"));
        System.out.println("number of element" + list.getCount());
        list.addToFront(new Employee(4,"vishal1","singh"));
        
        list.printList();
        System.out.println("list is empty or not..?" + list.isEmpty());        
        System.out.println("number of element" + list.getCount());
        
        
        //deleting node from linked list...
        EmployeeNode removedNode = list.remove();
        System.out.println("removed node is::" + removedNode.getEmp());
        System.out.println("number of element" + list.getCount()); 
    } 

    
}


class EmployeeNode
{ 
    private Employee emp;
    private EmployeeNode nextNode;
    
    public EmployeeNode (Employee emp)
    {
        this.emp = emp;
    }

    public Employee getEmp() {
        return emp;
    }

  
    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }
}


class EmployeeLinkedList {
    private EmployeeNode head;
    private int countNode = 0;
    
    
    void addToFront (Employee node)
    {
        EmployeeNode newNode = new EmployeeNode(node);
        newNode.setNextNode(head);
        head = newNode;  
        countNode ++;
    }
    
    int getCount(){
        return countNode;
    }
    
    void printList()
    {
        EmployeeNode temp = head;
        
        while(temp!=null)
        {
            System.out.println(temp.getEmp());
            System.out.println("=>");
            temp = temp.getNextNode();
        }   
    }
    
    boolean isEmpty()
    {
        if (head == null)
            return true;
        return false;
    }
    
    EmployeeNode remove()
    {
        
        EmployeeNode node = head;
        head = head.getNextNode();
        countNode--;
        node.setNextNode(null);
        
        return node;
    }
}

/*
insertion time of o(1) and deletion time of o(1)
seraching time can be more...


add d 
to
head -> a -> b -> c;

d.nextnode(head)
head = d;
head ->d -> a -> b -> c;
similary for deleting d

first get next node of head i.e a...
head = a
set d = null

*/