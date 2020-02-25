package Views;

import java.util.Locale;
import java.util.ResourceBundle;

public class View implements StringConstant{
    //Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua", "UA"));
                    new Locale("en"));

    //Utilities methods
    /**
     *
     * @param message
     */
    public static void printMessage(String message){
        System.out.println(message);
    }

    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String...message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message){
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
