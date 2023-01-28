import javax.lang.model.util.ElementScanner6;

public class HardcodedLogin {
    private boolean login;

    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        if(username=="admin" && password == "qwerty"){
            return true;
        }else if(username=="user" && password == "password"){
        return true;
    }else{
        return false;
    }
}

    public static void main(String[] args){
        // HardcodedLogin h = new HardcodedLogin();
        // System.out.println(h.login("admin", "qwerty"));
        // System.out.println(h.login("user", "password"));
    }
}


