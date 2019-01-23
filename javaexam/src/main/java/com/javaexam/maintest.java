package com.javaexam;

import java.util.*;
import java.util.stream.Collectors;

public class maintest {
  public static void main(String[] args) {

/*
    Function<String, Integer> intFunctionLambda = (String str) -> str.compareTo("abc") == 0 ? 1 : 0;

    System.out.println("intFunctionLambda test for abc=" + intFunctionLambda.apply("abc"));


    Function<String, Double> floatFunctionLambda =
        (String str) -> str.compareTo("abc") == 0 ? (double) 1.0 : (double) 0.0;

    System.out.println("floatFunctionLambda test for abc=" + floatFunctionLambda.apply("abc"));
*/
    Map<String, String> map1 = new HashMap<>();
    Map<String, String> map2 = new HashMap<>();

    Set<StringStr> set1 = new HashSet<>();
    List<StringStr> list1 = StringStr.getList(4, map1);
    List<StringStr> list22= StringStr.getList(10, map2);




//    System.out.println(list.get(1).key.contains(new String("번째")));


    list1.addAll(list22);
    for (StringStr list1str : list1) {
      System.out.println("list1str = " + list1str);
    }


    boolean b = list22.retainAll(list1);
    System.out.println("b = " + b);


    list22.add(new StringStr("33", "33"));
    list22.removeAll(list1);

    /*for (StringStr changelist1 : list1) {
      System.out.println("changelist1 = " + changelist1);
    }*/



      for (StringStr list22str : list22) {
        System.out.println("list22str = " + list22str);
    }


  }


static class StringStr {
  private String name;
  private String key;


  @Override
  public String toString() {
    return "StringStr{" +
        "name='" + name + '\'' +
        ", key='" + key + '\'' +
        '}';
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StringStr(String name, String key) {
    this.name = name;
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }






  static List<StringStr> getList(int value ,Map<String,String> map ) {
    for (int i = 0; i < value; i++) {
      map.put(i + "번째 str", i + "번째 value");
    }
    return getCollect(map);
  }

  private static List<StringStr> getCollect(Map<String, String> map) {
    return map.entrySet().stream().map(entry -> {
      String getKey = entry.getKey();
      String getValue = String.valueOf(entry.getValue());
      return new StringStr(getKey, getValue);
    }).collect(Collectors.toList());
  }

}
}
