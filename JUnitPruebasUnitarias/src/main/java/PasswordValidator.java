
public class PasswordValidator {

    public boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()_].*")) {
            return false;
        }
        return true;
    }
}
