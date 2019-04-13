package demo.printer;

public class LowerStringPrinter extends AbstractStringPrinter {
    @Override
    public void print(String str) {
        System.out.println(str.toLowerCase());
    }
}
