package demo.printer;

public class UpperStringPrinter extends AbstractStringPrinter {

    public void print(String str) {
        System.out.println(str.toUpperCase());
    }
}
