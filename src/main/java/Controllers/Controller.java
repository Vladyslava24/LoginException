package Controllers;

import Model.Model;
import Views.View;
import Model.NotUniqueLoginException;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();
        Model model = getModel(inputNoteNoteBook);
    }

    private Model getModel(InputNoteNoteBook inputNoteNoteBook) {
        Model model = null;
        while (true) {
            try {
                model = new Model(inputNoteNoteBook.getLogin(),
                        inputNoteNoteBook.getPassword());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                inputNoteNoteBook.inputLogin();
            }
        }
        return model;
    }
}
