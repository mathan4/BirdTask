package com.genSparkTask3;

public class problems {

    //Given the head of a linked list, remove the nth node from the end of the list and return its head.

    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode currentNode=head;
            ListNode next;

            int count=0;

            while(currentNode!=null){
                count++;
                currentNode=currentNode.next;
            }

            System.out.println(count);
            int k=count-n+1;
            if (k == 1) {
                return head.next;
            }
            currentNode=head;
            ListNode previousNode = null;

            for(int i = 1; i <k ; i++) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = currentNode.next;
            return head;
        }


    //Given an array nums containing n distinct numbers in the range [0, n],
    // return the only number in the range that is missing from the array.

    public int missingNumber(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        return res;
    }


    //Given an integer n, return true if it is a power of two. Otherwise, return false.
    //An integer n is a power of two, if there exists an integer x such that n == 2x.

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) break;
            n /= 2;
        }
        return false;

    }

    //Number of 1 Bits

    public int numSetBits(long a) {
        int count=0;
        while (a > 0) {
            if ( (a & 1) != 0)
                count++;
            a >>= 1;
        }
        return count;
    }

    //Given the head of a linked list and an integer val,
    // remove all the nodes of the linked list that has Node.val == val, and return the new head.

    //Cant find the solution facing time limit exceeded
    public ListNode removeElements(ListNode head, int val) {
        ListNode currentNode=head;
        ListNode previousNode=null;

        if(currentNode==null){
            return null;
        }

        while(currentNode!=null){
            if(currentNode.val==val){
                previousNode.next=currentNode.next;
            }else{
                previousNode=currentNode;
                currentNode=currentNode.next;
            }
        }

        return head;
    }


}
