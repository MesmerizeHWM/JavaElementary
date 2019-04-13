package demo.printer;

import java.util.Scanner;

public class StringPrinterDemo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some string");

        String inputString = scanner.next();

        boolean isValidInput = false;

        do {
            System.out.println("Please enter string printer type (U - upper, L - lower)");
            String inputType = scanner.next();
            if (isValidType(inputType)) {
                isValidInput = true;
                if (inputType.equals("U")) {
                    AbstractStringPrinter printer = new UpperStringPrinter();
                    printer.print(inputString);
                } else {
                    AbstractStringPrinter printer = new LowerStringPrinter();
                    printer.print(inputString);
                }
            }
        } while (!isValidInput);


    }

    private static boolean isValidType(String type) {
        if (type != null && (type.equals("U") || type.equals("L"))) {
            return true;
        }
        return false;
    }
}
