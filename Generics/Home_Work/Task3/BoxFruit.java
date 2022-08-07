package hometask;

public class BoxFruit<K, T extends Fruit> {
    private K key;
    private T obj;

    public BoxFruit(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "BoxFruit{" +
                "key=" + key.getClass().getName() +
                ", obj=" + obj.getClass().getName() +
                '}';
    }
}
