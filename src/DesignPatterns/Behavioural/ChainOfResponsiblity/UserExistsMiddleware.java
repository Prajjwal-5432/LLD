package DesignPatterns.Behavioural.ChainOfResponsiblity;

public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)) {
            System.out.println("Email not found");
            return false;
        }
        if(!server.isValidPassword(email, password)) {
            System.out.println("Password not valid");
            return false;
        }

        return checkNext(email, password);
    }
}
