package Model;

import java.util.ArrayList;

public class ExistingsLogin {
    String login;

    public static ArrayList existLoginList(){
        ArrayList<String> list = new ArrayList();
        list.add("Vlada_me");
        list.add("Andr_123");
        list.add("Qwerty");
        return list;
    }

    public static boolean checkLogin(String login){
        ArrayList<String> list= existLoginList();
        for (String log : list) {
            if (login.equals(log)) {
                return true;
            }
        }
        list.add(login);
        return false;
    }

   public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}