/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ejb.EJB;
import model.UserService;

/**
 *
 * @author Srujana
 */
@javax.faces.bean.ManagedBean
public class UserManager {

    @EJB
    private UserService userServiceBean;
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

    public String registerUser() {
        model.Users user = new model.Users(this.username, this.password);
        this.result = userServiceBean.createOrUpdate(user);
        return null;
    }
}
