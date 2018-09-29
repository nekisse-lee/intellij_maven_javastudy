package com.nekisse.java.ch06;

public class Ex06_03 {
    public static void main(String[] args) {
        String[] sarr=new String[10];
        if(sarr!=null){
            sarr[0]="Red";
            sarr[1]="Orange";
            sarr[2]="Yellow";
            sarr[3]="Green";
            sarr[4]="Blue";
            sarr[5]="DarkBlue";
            sarr[6]="Violet";
            sarr[7]="White";
            sarr[8]="Pink";
            sarr[9]="Navy";
        }//if
        //------------배열 요소 참조
        if(sarr!=null){
            for(int i=0;i<sarr.length;i++){
                if(sarr[i]!=null) System.out.print(sarr[i]+",");
            }
        }//if
        System.out.println();

        for (String s : sarr) {
            if (s != null) {
                System.out.println("s = " + s);
            }

        }
    }
};
