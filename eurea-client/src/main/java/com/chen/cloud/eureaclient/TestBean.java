package com.chen.cloud.eureaclient;

public class TestBean {

    private String name;

    private int age;

    private long result;

    private boolean boy;

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", result=" + result +
                ", boy=" + boy +
                '}';
    }

    public static void main(String[] args) {
        TestBean testBean = new TestBean();
        System.out.println(testBean);
    }


}
