package com.ayafitech.mavenproject1;

class LL_Node { 
//    static int currIndex = 0;
//    int index;
    int data;
    LL_Node next;
    
    LL_Node(int data) {
//        this.index = currIndex++;
        this.data = data;
        this.next = null;
    }
}

public class linked_list {
    LL_Node head = null;
    
    public void insertAtFirst(int data) {
        LL_Node newNode = new LL_Node(data);
        
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtLast(int data) {
        LL_Node newNode = new LL_Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        LL_Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    
    public void insertAtValue(int value,int data) {
        LL_Node newNode = new LL_Node(data);
        if(head == null) {
//            head = newNode;
            System.out.println("\nNot Found");
            return;
        }
        LL_Node currNode = head;
        while(currNode != null && currNode.data != value) {
            currNode = currNode.next;
        }
        
        if (currNode == null) {
            System.out.println("\nNot Found");
            return;
        }
        
        if (currNode.data == value) {
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        
    }
    
    public void insertAtIndex(int index, int data) {
        LL_Node newNode = new LL_Node(data);
        
        if (index < 0) {
            System.out.println("Invalid");
            return;
        }
        
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        LL_Node currNode = head;
        for (int i = 0; i < index-1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        
    }
    
    
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }
    
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        
        
        LL_Node currNode = head;
        while(currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    
    public void deleteAtValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println("Found & deleted!");
            return;
        }
        LL_Node currNode = head;
        LL_Node prevNode = null;
        
        while(currNode != null && currNode.data != value) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        
        if (currNode == null) {
            System.out.println("Data not found");
            return;
        }
        
        prevNode.next = currNode.next;
        System.out.println("Deleted");
    }
    
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index < 0) {
            System.out.println("List empty");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        LL_Node currNode = head;
        LL_Node prevNode = null;
        for (int i = 0; i < index; i++) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        
        if (currNode == null) {
            System.out.println("Index out of bound");
            return;
        }
        
        prevNode.next = currNode.next;
        System.out.println("Deleted at index " + index);
    }
    
    
    public void display() {
        System.out.println("");
        LL_Node currNode = head;
        while(currNode != null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    
    
    public static void main(String[] args) {
        linked_list ll = new linked_list();
        
        ll.insertAtFirst(10);
        ll.insertAtLast(20);
        ll.insertAtFirst(30);
       
        ll.display();
        
        ll.insertAtValue(10, 50);
        ll.display();
        
        ll.insertAtIndex(2, 100);
        ll.display();
        
        
        ll.deleteAtFirst();
        ll.display();
        
        ll.deleteAtLast();
        ll.display();
        
        ll.insertAtLast(90);
        ll.insertAtLast(80);
        ll.display();
        
        ll.deleteAtValue(50);
        ll.display();
        
        ll.deleteAtIndex(2);
        ll.display();
        
    }
}

