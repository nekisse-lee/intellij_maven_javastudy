package com.nekisse.java.ch13;

class DeepMyData implements Cloneable{

    String name;
    int codeId;

    public DeepMyData(String name, int code) {// 생성자
        this.name=name;
        this.codeId = code;
    }

    public String toString() {// toString메소드, 출력시에 반환
        return "이름:" + name + ", 번호:" + codeId;
    }

    public static DeepMyData[] deepCopy(DeepMyData[] data){
        int i;
        DeepMyData[] newData = new DeepMyData[data.length];// 반환 할 배열
        for (i = 0; i < data.length; i++) {// 복제할 데이터의 크기만큼 반복
            newData[i] = new DeepMyData(data[i].name, data[i].codeId);
            // 기존의 data 배열의 객체의 값을 가지는 새로운 Data형 객체를 생성해 newData배열에 넣음
        }
        return newData;	// 값이 복제된 배열 반환
    }
};
public class Ex13_14 {
    public static void main(String[] args) {
        DeepMyData xarr[] = new DeepMyData[3];
        xarr[0] = new DeepMyData("홍길동", 1);
        xarr[1] = new DeepMyData("이길동", 2);
        xarr[2] = new DeepMyData("박길동", 3);

        DeepMyData[] yarr=DeepMyData.deepCopy(xarr);

        System.out.println("============x변경전==============");
        for(int i=0;i<xarr.length;i++){
            System.out.print("x:"+xarr[i]+"\t");
            System.out.print("y:" + yarr[i]);
            System.out.println();
        }
        xarr[0].name="Mr.Kim";
        System.out.println("============x변경후==============");
        for(int i=0;i<xarr.length;i++){
            System.out.print("x:"+xarr[i]+"\t");
            System.out.print("y:" + yarr[i]);
            System.out.println();
        }
    }
};
