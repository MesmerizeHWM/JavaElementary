package org.java.elementary;

public class TestListDemo {

    public static void main(String[] args) {
        TestList firstList = new TestList();

        String string1 = "abc";
        String string2 = "abc";

        firstList.add(string1);
        firstList.add(string2);
        firstList.add(1, string2);

        System.out.println(firstList.indexOf(string1));
        System.out.println(firstList.indexOf(string2));
    }

}
