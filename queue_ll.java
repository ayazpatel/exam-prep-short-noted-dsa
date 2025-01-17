package com.ayafitech.mavenproject1;

class QL_Node {
    int data;
    QL_Node next;
    
    QL_Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class queue_ll {
    QL_Node front = null;
    QL_Node rear = null;
    
    public boolean isEmpty() {
        return front == null && rear == null;
    }
    
    public void enqueue(int data) {
        QL_Node newNode = new QL_Node(data);
        
        if (rear == null) {
            rear = newNode;
            front = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        int dequeueValue = front.data;
        if (front == rear) {
            rear = null;
        }
        System.out.println("\nDequeue value: " + dequeueValue);
        front = front.next;
    }
    
    public void display() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        
        QL_Node currNode = front;
        
        System.out.print("Elements: (");
        while(currNode != null) {
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;
        }
        System.out.print(")");
    }
    
    public static void main(String[] args) {
        queue_ll que = new queue_ll();
        
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5);
        
        que.display();
        
        que.dequeue();
        
        que.display();
    }
}
