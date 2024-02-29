package l33;

class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    static <T> boolean isEqual(Box<T> b1, Box<T> b2) {
        return b1.isValueEqual(b2.getData());
    }

    public boolean isValueEqual(T value) {
        return data == value;

    }
}

