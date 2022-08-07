package hometask;

public class Box <K,T> {
    private T obj;
    private K key;

    public Box(K key,T obj) {
        this.obj = obj;
        this.key = key;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }


}
