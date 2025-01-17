package com.ayafitech.mavenproject1;

class SL_Node {
    int data;
    SL_Node next;
    
    SL_Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class stack_ll {
    SL_Node top = null;
    
    public void push(int data) {
        SL_Node newNode = new SL_Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }
    
    public void pop() {
        if (top == null) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println("Popped value: " + top.data);
        top = top.next;
    }
    
    public void peek() {
        if (top == null) {
            System.out.println("Stack empty");
            return;
        }
        System.out.println("Peeked value: " + top.data);
        
    }
    
    public void display() {
        if (top == null) {
            System.out.println("Stack empty");
            return;
        }
        SL_Node vTop = top;
        System.out.print("Elements: ( ");
        while(vTop != null) {
            System.out.print(vTop.data + ", ");
            vTop = vTop.next;
        }
        System.out.print(")");
        
    }
    
    
    public static void main(String[] args) {
        stack_ll stk = new stack_ll();
        
        stk.push(1);
        stk.push(2);
        stk.push(3);
        
        stk.peek();
        
        stk.pop();
        
        stk.display();
    }
}
