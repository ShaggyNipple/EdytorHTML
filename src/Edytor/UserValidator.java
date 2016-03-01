package Edytor;

/**
 * Created by Dawid on 2016-02-09.
 */
public class UserValidator {
    private static final String name = "Dawid";
    private static final String password= "kaszub";

    public static boolean authenticate(String name, String password){
        if(UserValidator.password.equals(password) && UserValidator.name.equals(name))
            return true;
        else
            return false;
    }
}
