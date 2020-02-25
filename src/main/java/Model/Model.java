package Model;

public class Model {
    private String login;
    private String password;

    public Model() {
    }

    public Model(String login, String password) throws NotUniqueLoginException {
        if(ExistingsLogin.checkLogin(login)){
            throw new NotUniqueLoginException("This login already exist ", login);
        }
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
