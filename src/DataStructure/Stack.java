package DataStructure;

// DATE : 2024.04.02
// WRITER : 구예원
// CONTENT : Stack 구현 - isEmpty, push, pop
//         : Stack 생성 시 타입 지정할 수 있도록 제네릭 활용


import java.util.EmptyStackException;

public class Stack<T> {

    private Node<T> top;
    private int size;

    private static class Node<T>{

        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    //스택이 비었는지
    public boolean isEmpty(){
        return top ==null;

    }

    //pop
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    //push
    public void push(T data){
        Node newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }



}
