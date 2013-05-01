
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
    private model.UserService userServiceBean;
    private String username;
    private String password;
    private String result;

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

    public String getResult() {
        return this.result;
    }

    public String login() {
        model.Users user = this.userServiceBean.find(this.username);
        if (user != null && user.getPassword().compareTo(this.password) == 0) {
            this.result = "success";
        } else {
            this.result = "failure";
        }
        return null;
    }
}
