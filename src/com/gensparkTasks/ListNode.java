package com.gensparkTasks;

public class ListNode {

        private int data;

        private ListNode next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            if(data < 0) return;
            this.data = data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
}
