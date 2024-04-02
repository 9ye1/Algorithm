package Algorithm;

// DATE : 2024.04.02
// WRITER : 구예원
// CONTENT : Stack 구현 - isEmpty, push, pop

import java.util.EmptyStackException;

public class Stack {

    private Node top;
    private int size;

    private static class Node{

        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    //스택이 비었는지
    public boolean isEmpty(){
        return top ==null;

    }

    //pop
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    //push
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
}
