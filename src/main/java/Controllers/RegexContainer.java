package Controllers;

public interface RegexContainer {
    // Cyrillic name
    String REGEX_NAME_UKR = "[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "[A-Z][a-z0-9_-]{4,20}$";
    String REGEX_PASSWORD = "[A-Za-z0-9_-]{8,20}$";
}
