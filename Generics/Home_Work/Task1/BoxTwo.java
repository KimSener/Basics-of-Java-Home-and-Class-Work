package hometask;

public class BoxTwo<T> {
    private T obj;
    public BoxTwo (T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
