package org.java.project8task2;

import java.util.Objects;

public class Test {

    private int intField;

    private String stringField;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return intField == test.intField &&
                Objects.equals(stringField, test.stringField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intField, stringField);
    }

    public Test(int intField, String stringField) {
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
        return "Test{" +
                "intField=" + intField +
                ", stringField='" + stringField + '\'' +
                '}';
    }
}
