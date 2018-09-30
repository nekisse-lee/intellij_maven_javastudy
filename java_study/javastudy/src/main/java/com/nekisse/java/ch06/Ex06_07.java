package com.nekisse.java.ch06;


public class Ex06_07 {
    public static void main(String[] args) {
        int[] arr={56,78,12,34,92};
        if(arr!=null){
            for(int i=0;i<arr.length;i++){
                for(int j=(i+1);j<(arr.length-1);j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }//for
            }//for
            //---정렬 후 출력--
            for(int i=0;i<arr.length;i++){
                System.out.println("arr["+i+"]:"+arr[i]);
            }
        }//if
    }
};
