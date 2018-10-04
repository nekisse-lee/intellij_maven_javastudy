package com.nekisse.java.ch14;

public class MultiTypeMain {
    public static void main(String[] args) {
        MyMapPair<String, Double> stringDoubleMultiTypePair = new MultiTypePair<String, Double>("seoul", 36.5);

        String key = stringDoubleMultiTypePair.getKey();
        System.out.println("key = " + key);
        Double value = stringDoubleMultiTypePair.getValue();
        System.out.println("value = " + value);
    }
}
