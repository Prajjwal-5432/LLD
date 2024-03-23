package DesignPatterns.Behavioural.ChainOfResponsiblity;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com")) {
            System.out.println("Welcome Admin");
            return checkNext(email, password);
        }
        System.out.println("Welcome User");
        return checkNext(email, password);
    }
}
