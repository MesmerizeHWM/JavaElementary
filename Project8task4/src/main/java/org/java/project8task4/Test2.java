package org.java.project8task4;

public class Test2 implements Comparable<Test2>{

    private int intField;
    private String stringField;

    public int compareTo(Test2 o) {
        return stringField.compareTo(o.getStringField());
    }

    public Test2(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public String getStringField() {
        return stringField;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
