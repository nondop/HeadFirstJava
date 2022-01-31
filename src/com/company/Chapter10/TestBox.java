package com.company.Chapter10;

public class TestBox {

    Integer i = 1;
    int j;

    public static void main(String[] args) {
        TestBox testBox = new TestBox();
        testBox.go();
    }
        public void go(){
            j = i;
            System.out.println(j);
            System.out.println(i);
        }
}
