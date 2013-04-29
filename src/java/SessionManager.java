
import javax.ejb.EJB;
import model.UserServiceBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Srujana
 */
@javax.faces.bean.ManagedBean
public class SessionManager {
    @EJB
    private UserServiceBean userServiceBean;
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String login() {
        model.Users user = new model.Users(this.username, this.password);
        this.userServiceBean.find(user);
        return "success";
    }
}
