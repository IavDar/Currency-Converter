package l30;

public class DoubleNode {
    int data;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}

class DoubleLinkedList implements List {

     DoubleNode head;
     DoubleNode tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(int data) {
        DoubleNode temp = new DoubleNode(data);

        if (head != null) {
            head.prev = temp;
        }

        temp.next = head;
        head = temp;
    }

    @Override
    public void add(int data, int index) {
        DoubleNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        DoubleNode temp = new DoubleNode(data);
        cur.next.prev = temp;
        temp.next = cur.next;
        temp.prev =cur;
        cur.next = temp;

    }

    @Override
    public void remove() {
        head = head.next;
        head.prev = null;
    }

    @Override
    public void print() {
        DoubleNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }

    }

}
