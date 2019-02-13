package com.javaexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToListExam {

  private static void streamToList() {

    ArrayList<String> myList = null;
    List<String> listOfStream = new ArrayList<>();
    Stream<String> streamOfString = null;
    ArrayList<String> arrayList = null;
    Stream<String> arr = Arrays.stream(new String[]{"1", "2", "3"});


    streamOfString = Stream.of("Apple", "BB", "CC", "DD", "EE");
    myList = new ArrayList<>();
    streamOfString.forEachOrdered(myList::add);
    System.out.println("myList = " + myList);

    System.out.println("myList.get(0) = " + myList.get(0));




  }

  public static void main(String[] args) {
    streamToList();
  }
}
