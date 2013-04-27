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

    User createOrUpdate(User user);

    /**
     *
     * @param user
     */
    void remove(User user);

    /**
     *
     * @param id
     * @return
     */
    User find(Object id);
}
