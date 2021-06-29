package com.company.Accolite;

public class ReverseLinkedList {
    class Node {
        int element;
        Node next;
        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public ReverseLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addlast(int e) {
        Node newest = new Node(e, null);
        if(isEmpty())
            head = newest;
        else
            tail.next = newest;
        tail = newest;
        size = size + 1;
    }

    public void addFirst(int e) {
        Node newest = new Node(e, null);
        if(isEmpty()) {
            head = newest;
            tail = newest;
        }
        else {
            newest.next = head;
            head = newest;
        }
        size = size + 1;
    }

    public void addAny(int e, int position) {
        if(position < 0 || position > size) {
            System.out.println("Invalid Position");
            return;
        }
        if(position==0) {
            addFirst(e);
            return;
        }
        else {
            Node newest = new Node(e, null);
            Node p = head;
            int i = 0;
            while (i < position - 1) {
                p = p.next;
                i = i + 1;
            }
            newest.next = p.next;
            p.next = newest;
        }
        size = size + 1;
    }

    public void insertsorted(int e) {
        Node newest = new Node(e, null);
        if(isEmpty())
            head = newest;
        else {
            Node p = head;
            Node q = head;
            while(p!=null && p.element < e) {
                q = p;
                p = p.next;
            }
            if(p==head) {
                newest.next = head;
                head = newest;
            }
            else {
                newest.next = q.next;
                q.next = newest;
            }
        }
        size = size + 1;
    }

    public int removeFirst() {
        if(isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }
        int e = head.element;
        head = head.next;
        size = size - 1;
        if(isEmpty())
            tail = null;
        return e;
    }

    public int removeLast() {
        if(isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }
        Node p = head;
        int i = 1;
        while(i < size-1 ) {
            p = p.next;
            i = i + 1;
        }
        tail = p;
        p = p.next;
        int e = p.element;
        tail.next = null;
        size = size - 1;
        return e;
    }

    public int removeAny(int position) {
        if(position < 0 || position > size-1) {
            System.out.println("Invalid Position");
            return -1;
        }
        if(position==0) {
            int e = removeFirst();
            return e;
        }
        else {
            Node p = head;
            int i = 0;
            while(i < position-1) {
                p = p.next;
                i = i + 1;
            }
            int e = p.next.element;
            p.next = p.next.next;
            size = size - 1;
            return e;
        }
    }

    public int search(int key) {
        Node p = head;
        int index = 0;
        while(p!=null) {
            if(p.element==key)
                return index;
            p = p.next;
            index = index + 1;
        }
        return -1;
    }

    public void display() {
        Node p = head;
        while(p!=null) {
            System.out.print(p.element + " --> ");
            p = p.next;
        }
        System.out.println();
    }



    public static void main(String args[]) {
        ReverseLinkedList l = new ReverseLinkedList();
        l.insertsorted(7);
        l.insertsorted(4);
        l.insertsorted(12);
        l.insertsorted(8);
        l.insertsorted(3);
        l.display();
  


        System.out.println("Size: "+l.length());
    }

}
