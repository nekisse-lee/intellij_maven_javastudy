package com.nekisse;

public class MyBeanTest {
    public static void main(String[] args) {
        //같은 package 에 있는 클래스는 import 할 필요가 없다.
        //MyBean이 가지고 있는 클래스변수 사용할수 있도록
        //  미리 메모리에 올라간다.
        //같은 클래스는 디스크에서 딱 한번만 읽어들인다.
        //한번 읽어들인 클래스 정보는 메모리에 올라가 있고
        //두번째 부터는 메모리에 있는 클래스 정보를 사용한다.
        MyBean bean1 = new MyBean();
        MyBean bean2 = new MyBean();

        MyBean.staticValue  = 5;

        System.out.println(MyBean.staticValue);

        bean1.instanceValue = 100;
        System.out.println("bean2.instanceValue = " + bean2.instanceValue);

    }
}
