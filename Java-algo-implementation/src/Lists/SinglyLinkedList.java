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
        list.addToFront(new Employee(1,"vishal1","singh"));
        list.addToFront(new Employee(2,"vishal1","singh"));
        list.addToFront(new Employee(3,"vishal1","singh"));
        list.addToFront(new Employee(4,"vishal1","singh"));
        
        list.printList();
        
        
        
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
    
    
    void addToFront (Employee node)
    {
        EmployeeNode newNode = new EmployeeNode(node);
        newNode.setNextNode(head);
        head = newNode;  
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
    
    
}
