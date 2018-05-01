package datastructure;

import java.util.LinkedList;

public class LinkedListDS {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        Node nd = new Node();
        nd.data = 10;

        insert(nd, 20);
        print(nd);


    }

    static void print(Node nd) {
        while (nd != null) {
            System.out.println(nd.data);
            nd = nd.next;
        }
    }

    static Node insert(Node head, int data) {

        Node nd = new Node();
        nd.data = data;

        if (head == null) {
            return nd;
        }

        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = nd;

        return head;

    }

}

class Node {
    int data;
    Node next;
}
