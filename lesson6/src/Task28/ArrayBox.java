package Task28;

import java.util.Arrays;

public class ArrayBox<T> {
    private T[] box;

    public T get(int index) {
        return box[index];
    }

    public ArrayBox() {
    }

    public ArrayBox(T[] box) {
        this.box = box;
    }

    public T[] getBox() {
        return box;
    }

    public void setBox(T[] box) {
        this.box = box;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayBox<?> arrayBox = (ArrayBox<?>) o;
        return Arrays.equals(box, arrayBox.box);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(box);
    }

    @Override
    public String toString() {
        return "ArrayBox{" +
                "box=" + Arrays.toString(box) +
                '}';
    }
}
