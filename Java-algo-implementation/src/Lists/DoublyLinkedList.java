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
public class DoublyLinkedList 
{
    
    public static void main(String[] args) 
    {
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        
        
        list.addNodeFromFront(new Employee(1,"vishal1","singh"));
        System.out.println("number of element" + list.nodeCount());
        list.addNodeFromFront(new Employee(2,"vishal1","singh"));
        list.addNodeFromFront(new Employee(3,"vishal1","singh"));
        System.out.println("number of element" + list.nodeCount());
        list.addNodeFromFront(new Employee(4,"vishal1","singh"));
        
        list.printList();        
        System.out.println("number of element" + list.nodeCount());
        
        list.addNodeFromBack(new Employee(7,"ss","end"));
        list.printList();
        
        //removing node from front....
        System.out.println("Node removed,,,");
        list.removeNodeFromFront();
        list.printList();
        
        //removing node from back....
        System.out.println("Node removed,,,");
        list.removeNodeFromBack();
        list.printList();
        
        list.addBeforeNode(new Employee(9,"newnode","node"),new Employee(2,"vishal1","singh") );
        
        list.printList();
        
        
    }
        
}

class EmployeeTwoSidedLinkedList
{
    private Employee emp;
    private EmployeeTwoSidedLinkedList left, right;

    public EmployeeTwoSidedLinkedList(Employee emp) 
    {
        this.emp = emp;    
    }
    
    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public EmployeeTwoSidedLinkedList getLeft() {
        return left;
    }

    public void setLeft(EmployeeTwoSidedLinkedList left) {
        this.left = left;
    }

    public EmployeeTwoSidedLinkedList getRight() {
        return right;
    }

    public void setRight(EmployeeTwoSidedLinkedList right) {
        this.right = right;
    } 
}

class EmployeeDoublyLinkedList{
    private EmployeeTwoSidedLinkedList head;
    private EmployeeTwoSidedLinkedList tail;
    private int count = 0;
    
    void addNodeFromFront (Employee emp)
    {
        count ++;
        EmployeeTwoSidedLinkedList newNode = new EmployeeTwoSidedLinkedList(emp);
        newNode.setRight(head);
        if (head == null)
        {
            tail = newNode;
        }
        else 
        {
            head.setLeft(newNode);
        }
        head = newNode;
    }
    
    void addNodeFromBack (Employee emp)
    {
        count ++;
        EmployeeTwoSidedLinkedList newNode = new EmployeeTwoSidedLinkedList(emp);
        newNode.setLeft(tail);
        
        if (tail == null)
            head = newNode;
        else
            tail.setRight(newNode);
        
        tail = newNode;
    }
    
    void addNodeAtSomePosition (int position)
    {
        
    }
    
    
    int nodeCount ()
    {
        return count;
    }
    
    void printList()
    {
        EmployeeTwoSidedLinkedList temp = head;
        
        while(temp!=null)
        {
            System.out.print(temp.getEmp());
            System.out.print(" <=> ");
            temp = temp.getRight();
        }   
    }
    
    
    EmployeeTwoSidedLinkedList removeNodeFromFront ()
    {
        //first handle if there is only one element in the list
        EmployeeTwoSidedLinkedList removeNode = head;
        count --;
        
        if (count < 1)
        {
            head = null;
            tail = null;
        }
        
        head = head.getRight();
        head.setLeft(null);
        removeNode.setRight(null);
        
         return removeNode;   
    }
    
    EmployeeTwoSidedLinkedList removeNodeFromBack ()
    {
        //first handle if there is only one element in the list
        EmployeeTwoSidedLinkedList removeNode = tail;
        count --;
        
        if (count < 1)
        {
            head = null;
            tail = null;
        }
        
        tail = tail.getLeft();
        tail.setRight(null);
        removeNode.setLeft(null);
        
         return removeNode;   
    }
    
    //solving the challenge 1
    
    void addBeforeNode (Employee insert, Employee insertBefore)
    {
        //first find the node in the list where to insert...
        EmployeeTwoSidedLinkedList newnode = new EmployeeTwoSidedLinkedList(insert);
        EmployeeTwoSidedLinkedList temp = head;
        while (!temp.getEmp().equals(insertBefore)){
            temp = temp.getRight();
        }
        
        temp.getLeft().setRight(newnode);
        newnode.setLeft(temp.getLeft());
        newnode.setRight(temp);
        temp.setLeft(newnode);
    }
}