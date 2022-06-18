package myproject.labreport.config.business;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);

}