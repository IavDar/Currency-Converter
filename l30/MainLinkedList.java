package l30;

public class MainLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(15);
        list.add(30);
        list.add(50);
        list.add(20, 1);
        list.print();

        System.out.println();
        list.remove();
        list.print();

    }
}
