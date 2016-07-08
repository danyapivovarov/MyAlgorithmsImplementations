package com.danyapivovarov.datastructs;

/**
 * Created by dpivovar on 06.07.2016.
 */
public class Node<T> {
    private T data;
    private Node next;

    public T getData() {
        return data;
    }

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{data=" + data + "}";
    }
}
