/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.ejb.EJB;
import model.UserServiceBean;

/**
 *
 * @author Srujana
 */
@javax.faces.bean.ManagedBean
public class UserManager {
    @EJB
    private UserServiceBean userServiceBean;
    private String username;
    private String password;
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return this.username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public String registerUser(){
        model.User user=new model.User(this.username,this.password);
        userServiceBean.createOrUpdate(user);
        return "success";
    }
}
