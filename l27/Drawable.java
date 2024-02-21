package l27;

public interface Drawable {
    void draw ();
    default void resize() {
        System.out.println("Изменяем размер");
    }
}
