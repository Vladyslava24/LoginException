package Controllers;

import Views.View;

import java.util.Scanner;

public class UtilityMethod {
    private Scanner sc;
    private View view;

    public UtilityMethod(Scanner sc, View view) {
            this.sc = sc;
            this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printStringInput(message);
        while( !(sc.hasNext() && (res = sc.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}
