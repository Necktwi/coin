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
@javax.faces.bean.ManagedBean
@javax.faces.bean.ApplicationScoped
public class UserServiceBean implements UserService {

    @PersistenceContext
    private EntityManager em;

    /**
     *
     * @param user
     * @return
     */
    @Override
    public User createOrUpdate(User user) {
        em.merge(user);
        return ""
    }

    @Override
    public void remove(User user) {
        em.remove(em.merge(user));
    }

    @Override
    public User find(Object id) {
        return em.find(User.class, id);
    }
}
