package com.ayafitech.mavenproject1;

class CQL_Node {
    int data;
    CQL_Node next;
    
    CQL_Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class cqueue_ll {
    CQL_Node front = null;
    CQL_Node rear = null;
    
    public boolean isEmpty() {
        return front == null && rear == null;
    }
    
    public void enqueue(int data) {
        CQL_Node newNode = new CQL_Node(data);
        
        if (rear == null) {
            rear = newNode;
            front = newNode;
            rear.next = front;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        rear.next = front;
    }
    
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        int dequeueValue = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        }
        System.out.println("\nDequeue value: " + dequeueValue);
        front = front.next;
        rear.next = front;
    }
    
    public void display() {
        if (front == null) {
            System.out.println("Empty");
            return;
        }
        
        CQL_Node currNode = front;
        
        System.out.print("Elements: (");
        do {
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;
        } while (currNode != front);
        System.out.print(")");
    }
    
    public static void main(String[] args) {
        cqueue_ll que = new cqueue_ll();
        
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
