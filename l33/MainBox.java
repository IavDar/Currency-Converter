package l33;

public class MainBox {
    public static void  main(String[] args) {

        Box<Integer> b1 = new Box<>();
        b1.setData(10);

        Box<Integer> b2 = new Box<>();
        b2.setData(20);

        System.out.println(b1.getData());
        System.out.println(b2.getData());

        boolean isEqual = Box.isEqual(b1, b2);
        System.out.println(isEqual);

        boolean isValueEqual = b1.isValueEqual(10);
        System.out.println(isValueEqual);

        isValueEqual = b2.isValueEqual(30);
        System.out.println(isValueEqual);

    }

}
