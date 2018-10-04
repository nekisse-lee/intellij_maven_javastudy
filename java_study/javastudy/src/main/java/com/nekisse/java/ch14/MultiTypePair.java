package com.nekisse.java.ch14;

public class MultiTypePair<K,V> implements MyMapPair<K,V> {
    private K key;
    private V value;

    public MultiTypePair(K key,V value) {
        this.key=key;
        this.value=value;
    }


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}