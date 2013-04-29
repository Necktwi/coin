/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author newmek7
 */
import javax.ejb.Local;

@Local
public interface UserService {

    /**
     *
     * @param user
     * @return (String)"success" on insert, "exists" if user aleready exists and "failed" if not added.
     */
    String createOrUpdate(Users user);

    /**
     *
     * @param user
     */
    void remove(Users user);

    /**
     *
     * @param id
     * @return
     */
    Users find(Object id);
}
