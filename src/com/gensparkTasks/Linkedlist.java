package com.gensparkTasks;

public class Linkedlist {
    private ListNode head;


    public void addListNodeToTheEndOfLinkedList(int value) {
        ListNode newNode = new ListNode(value,null);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setNext(null);
    }
    public void traverseTheLinkedList() {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }

    }
    public int countNodesofLinkedList() {
        int countNodes = 0;

        for(ListNode temp = head; temp != null; temp = temp.getNext()) {
            countNodes++;
        }

        return countNodes;
    }

    void deleteTheLastListNode() {
        if(head == null) {
            return;
        }
        if(head.getNext() == null) {
            head = null;
            return;
        }
        ListNode temp1 = head;
        ListNode temp2 = null;

        while(temp1.getNext() != null) {
            temp2 = temp1;
            temp1 = temp1.getNext();
        }
        temp2.setNext(null);
    }

   public void deleteTheNodeAtKthPosition(int k) {

        if(k == 0) {
            head = head.getNext();
            return;
        }
        ListNode temp1 = head;
        ListNode temp2 = null;

        for(int i = 0; i < k ; i++) {
            temp2 = temp1;
            temp1 = temp1.getNext();
        }
        ListNode addressOFNextToNextNode = temp1.getNext();
        temp2.setNext(null);
        temp2.setNext(addressOFNextToNextNode);
    }

    public void deleteMiddleElement(){
        int length=countNodesofLinkedList();
        System.out.println(length);
        int middle;
        if((length&1)==0){
            middle=(length/2);
        }else {
            middle=(length-1)/2;
        }
        deleteTheNodeAtKthPosition(middle);
    }
}
