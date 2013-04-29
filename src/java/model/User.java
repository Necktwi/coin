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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author newmek7
 */
@Entity
@javax.persistence.Table(name = "USERS")
@SequenceGenerator(name="USER_SEQUENCE_GENERATOR", sequenceName="USER_SEQUENCE", initialValue=1, allocationSize=1)
public class User implements Serializable {

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQUENCE_GENERATOR")
    @Column(name = "ID")
    private Long id;
    @Id
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
