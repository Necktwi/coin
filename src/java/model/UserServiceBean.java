/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author newmek7
 */
@javax.ejb.Stateless
public class UserServiceBean implements UserService {

    @PersistenceContext(unitName = "coinPU")
    private EntityManager em;

    /**
     *inserts user into database.
     * @param user
     * @return
     */
    @Override
    public String createOrUpdate(Users user) {
        try {
            em.persist(user);
        } catch (javax.persistence.EntityExistsException e) {
            return "exists";
        }
        return "success";
    }

    @Override
    public void remove(Users user) {
        em.remove(em.merge(user));
    }

    @Override
    public Users find(Object id) {
        return em.find(Users.class, id);
    }
}
