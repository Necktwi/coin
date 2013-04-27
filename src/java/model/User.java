/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author newmek7
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author newmek7
 */
@Entity
@javax.persistence.Table(name = "USERS")
@javax.faces.bean.ManagedBean
@javax.faces.bean.ApplicationScoped
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERNAME")
    private String name;
    @Column(name = "PASSWORD")
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
