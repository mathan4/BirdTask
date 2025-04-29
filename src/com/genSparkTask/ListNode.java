package com.genSparkTask;

public class ListNode {

    private int data;

    private com.gensparkTasks.ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if(data < 0) return;
        this.data = data;
    }

    public com.gensparkTasks.ListNode getNext() {
        return next;
    }

    public void setNext(com.gensparkTasks.ListNode next) {
        this.next = next;
    }

    public ListNode(int data, com.gensparkTasks.ListNode next) {
        this.data = data;
        this.next = next;
    }
}
