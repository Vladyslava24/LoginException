package Controllers;

import Model.Model;
import Views.View;
import java.util.Scanner;


public class InputNoteNoteBook implements RegexContainer{
    private View view;
    private Scanner sc;
    private Model model;

    private String login;
    private String password;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityMethod utilityController =
                new UtilityMethod(sc, view);
        this.login = (utilityController.inputStringValueWithScanner
                (View.INPUT_LOGIN_DATA, REGEX_PASSWORD));
        this.password = (utilityController.inputStringValueWithScanner
                        (View.INPUT_PASSWORD_DATA, REGEX_PASSWORD));
    }

    public void inputLogin(){
        UtilityMethod utilityController =
                new UtilityMethod(sc, view);
        this.login = (utilityController.inputStringValueWithScanner
                (View.INPUT_LOGIN_DATA, REGEX_LOGIN));
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}